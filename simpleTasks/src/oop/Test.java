package oop;

import a.TestSort;
import test1.Bill;
import test1.PaymentBrokerEndpoint;
import test1.PaymentBrokerEndpointService;
import test1.UpbsException_Exception;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;

/**
 * Created by mikhail_alferov on 26.04.2017.
 */
public class Test {
    public static void main(String[] args) throws UpbsException_Exception {
       String s = "jjj\tggg";

        System.out.println(s.charAt(2) == 9);
        System.out.println(s);
        Test test = new Test();
        PaymentBrokerEndpoint paymentBrokerEndpoint = test.upbsService();
        List<Bill> bills = new ArrayList<>();
        bills.add(new Bill());
        paymentBrokerEndpoint.calculateTariffs(bills);

    }

    public Object getBill() {
        return new Object();
    }

    private PaymentBrokerEndpoint upbsService() {
        try {
            //PaymentBrokerEndpointService paymentBrokerEndpointService = new PaymentBrokerEndpointService(new URL("http://localhost:9580/UPBS/paymentBroker/PaymentBroker-Service?wsdl"));
            PaymentBrokerEndpointService paymentBrokerEndpointService = new PaymentBrokerEndpointService(getClass().getClassLoader().getResource("mok/upbs.wsdl"));
            PaymentBrokerEndpoint paymentBrokerEndpointPort = paymentBrokerEndpointService.getPaymentBrokerEndpointPort();

            //Set timeout until a connection is established
            Map<String, Object> requestContext = ((BindingProvider) paymentBrokerEndpointPort).getRequestContext();
            requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:9580/UPBS/paymentBroker/PaymentBroker-Service?wsdl");
            requestContext.put("javax.xml.ws.client.connectionTimeout", "15000");
            //Set timeout until the response is received
            requestContext.put("javax.xml.ws.client.receiveTimeout", 10000);
            requestContext.put("com.sun.xml.internal.ws.connect.timeout", 10000);
            requestContext.put("com.sun.xml.internal.ws.request.timeout", 10000);
            requestContext.put("com.sun.xml.ws.connect.timeout", 10000);
            requestContext.put("com.sun.xml.ws.request.timeout", 10000);
            //Set auth user
            requestContext.put(BindingProvider.USERNAME_PROPERTY, "IFOBS");
            requestContext.put(BindingProvider.PASSWORD_PROPERTY, "IFOBS");
            //Set client locale header (as Standard HTTP header)
            Map<String, List<String>> headers = new HashMap<>();
           // headers.put(HTTP_HEADER_LANGUAGE, Collections.singletonList(clientLocal));
            requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

            return paymentBrokerEndpointPort;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
