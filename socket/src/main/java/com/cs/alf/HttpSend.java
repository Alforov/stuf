package com.cs.alf;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient; /*ver 4.5.1*/
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.*;

public class HttpSend  {

    public static void main(String[] args) throws Exception {
        String CalcFeeRequest = "<?xml version=\"1.0\" encoding=\"windows-1251\"?>\n" +
                "<REQUEST OBJECT_CLASS=\"TMoneyOrderObject\"  ACTION=\"Check\" POINT_CODE=\"AFFK\" USER_ID=\"-1\" INT_SOFT_ID=\"7824A25D-D982-4052-B8B0-370C9B8F2CF5\">\n" +
                "\t<sName>БЕЛКИН</sName>\n" +
                "\t<sLastName>СЕРГЕЙ</sLastName>\n" +
                "\t<sSurName>ПЕТРОВИЧ</sSurName>\n" +
                "\t<sCountryC>RU</sCountryC>\n" +
                "\t<sIDtype>Паспорт гражданина РФ</sIDtype>\n" +
                "\t<sIDtypeCode>RU.1</sIDtypeCode>\n" +
                "\t<sIDnumber>1234 567890</sIDnumber>\n" +
                "\t<sResidentC>RU</sResidentC>\n" +
                "\t<sPhone>7-916-1234567</sPhone>\n" +
                "\t<trnCurrency>RUR</trnCurrency>\n" +
                "\t<trnSendPoint>ваша тестовая точка (код)</trnSendPoint>\n" +
                "\t<trnAmount>1234.00</trnAmount>\n" +
                "\t<trnDate> текущая дата в формате YYYYMMDD</trnDate>\n" +
                "\t<trnPickupPoint>CDPA</trnPickupPoint>\n" +
                "\t<trnService>2</trnService>\n" +
                "\t<bName>ЗАЙЦЕВ</bName>\n" +
                "\t<bLastName>ВЛАДИМИР</bLastName>\n" +
                "\t<bSurName>ИВАНОВИЧ</bSurName>\n" +
                "</REQUEST>";
        SendRequest(CalcFeeRequest);

    }

    public static void SendRequest (String req) throws IOException{

        String url = "http://alligator:8085";

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        post.setHeader("User-Agent", "Mozilla/5.0");
        post.setHeader("Content-type", "text/xml; charset=WINDOWS-1251");

        StringEntity entity = new StringEntity(req,"WINDOWS-1251");
        post.setEntity(entity);
        try {

            HttpResponse response = client.execute(post);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent(), "windows-1251"));

          //  InputStreamReader inputStreamReader = new InputStreamReader(response.getEntity().getContent());
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            System.out.println("Response : "
                    + result.toString());
        } finally {

            post.releaseConnection();
        }
    }
}
