package com.cs.alf;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mikhail_alferov on 07.08.2017.
 */
public class UnisapTest {
    public static void main(String[] args) throws IOException {
        //String sessionId = checkRequest("3");
        //payRequest(sessionId);
        statusRequest("3");
    }

    private static void statusRequest(String sessionId) throws IOException {
        Map<String, String> map = new LinkedHashMap<String, String>();
        fillBaseRequestParamMap(map,sessionId);
        map.put("Hashcode", getHash(map));
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(createGetRequest(map));
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        entity.writeTo(System.out);
        /*SessionID=AAAAAAAAA&MachineMark=<MachineMark>&ClearingNumber=<ClearingNumber&Hashcode*/
    }

    private static void payRequest(String sessionId) throws IOException {
        Map<String, String> map = new LinkedHashMap<String, String>();
        fillBaseRequestParamMap(map,sessionId);
        map.put("CardPayment", "0");
        map.put("CardNr", "4300000000000777");
        map.put("BankCode", "44");
        map.put("Amount", "5000.00");
        map.put("Hashcode", getHash(map));
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(createGetRequest(map));
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        entity.writeTo(System.out);
/*CardPayment=0&					//тип оплаты, 0-Нал, 1-DUET, 2-EMV Online
CardNr=&						//номер карты (можно маск. формат)
BankCode=&						//код банка (необязательный)
Amount=5000.00&					//сумма платежа в СУМах
Hashcode=vAfSZq………..C1%2bLZy%
*/

    }

    private static String checkRequest(String sessionId) throws IOException {
        Map<String, String> map = new LinkedHashMap<String, String>();
        fillBaseRequestParamMap(map,sessionId);
        map.put("Fields", "phone_number=901234568");
        map.put("Hashcode", getHash(map));
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(createGetRequest(map));
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        entity.writeTo(System.out);
        System.out.println("-------------------------------");
        return map.get("SessionID");
    }

    private static void fillBaseRequestParamMap(Map<String, String> map, String sessionId) {
        map.put("SystemUserID", "a224e317-e1c3-4d85-bced-c9798513d6fc");
        map.put("MachineMark", "10001");
        map.put("ClearingNumber", "2");
        map.put("ServiceID", "201");
        map.put("SessionID", sessionId);
    }

    private static String createGetRequest(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("http://217.29.124.204:8555/unisap/Terminal/Gateway/Alternative/Check.ashx?");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            if (!"Hashcode".equals(entry.getKey())) {
                sb.append("&");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    private static String getHash(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("F8nFjm69Hn8i9G7p7koHImFDBCE7kHDm");
        return Base64.encodeBase64String(DigestUtils.sha1(stringBuilder.toString().getBytes()));
    }
}
