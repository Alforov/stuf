package com.cs.efour.server.ws.sync;


import com.cs.efour.server.ws.sync.model.CardInfoRequest;
import com.cs.efour.server.ws.sync.model.CardInfoResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;


@WebService(name = "EfourSyncWs")
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class EfourSyncWs implements EfourSyncWsRemote {
    private final static String wsNameSpace = "http://sync.ws.server.efour.cs.com/";

    @WebMethod
    public String call(String input) {
        return input;
    }

    @WebMethod
    public String callCompressed(String zippedEncodedRequestStr) throws Exception {

        return "test";
    }

    @WebMethod
    public void getCardInfo(@WebParam(name = "CardInfoRequest", targetNamespace = wsNameSpace) CardInfoRequest cardInfoRequest,
                            @WebParam(mode = WebParam.Mode.OUT, name = "CardInfoResponse", targetNamespace = wsNameSpace) Holder<CardInfoResponse> cardInfoResponse) throws Exception {
        cardInfoResponse.value = new CardInfoResponse();
    }


}