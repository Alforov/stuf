package com.cs.efour.server.ws.sync;

import com.cs.efour.server.ws.sync.model.CardInfo;
import com.cs.efour.server.ws.sync.model.CardInfoResponse;
import com.cs.efour.server.ws.sync.model.ResponseMetaData;
import com.cs.efour.server.ws.sync.model.ResponseStatus;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

/**
 * Created by mikhail_alferov on 28.09.2015.
 */
public class XMLUtils {
    public static Document loadXMLFromString(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        return builder.parse(is);
    }

    public static String getXMLValueByTag(Document doc, String strNode) {
        String value = null;
        try {
            if ((doc == null) || (strNode == null)) {
                return null;
            }

            final NodeList nl = doc.getElementsByTagName(strNode);

            if ((nl != null)) {
                for (int i = 0; i < nl.getLength(); i++) {
                    if (nl.item(i) != null && nl.item(i).getFirstChild() != null &&
                            nl.item(i).getFirstChild().getNodeValue() != null && !nl.item(i).getFirstChild().getNodeValue().isEmpty())
                        value = (nl.item(i).getFirstChild().getNodeValue());
                }
            }

            return value;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return value;
    }

    public static String getAttributeValue(Document xml, String tagName,
                                           String attributeName) {
        String res = null;
        try {
            res = xml.getElementsByTagName(tagName).item(0).getAttributes().
                    getNamedItem(attributeName).getFirstChild().getNodeValue();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (res == null) ? "" : res;
    }


    public static CardInfoResponse getCardInfoResponse(String xml) throws Exception {
        CardInfoResponse cardInfoResponse = new CardInfoResponse();
        ResponseMetaData responseMetaData = new ResponseMetaData();
        cardInfoResponse.setMetaData(responseMetaData);
        Document document = loadXMLFromString(xml);
        String errorCode = getAttributeValue(document, "error", "resultcode");
        if (!"1000010".equals(errorCode)) {
            responseMetaData.setStatus(ResponseStatus.ERROR);
            responseMetaData.setError(errorCode);
        } else {
            String expirationdate = getXMLValueByTag(document, "expirationdate");
            if (expirationdate != null && !expirationdate.isEmpty()) {
                CardInfo cardInfo = new CardInfo();
                cardInfo.setExpirationdate(expirationdate);
                cardInfo.setCardno(getXMLValueByTag(document, "cardno"));
                cardInfo.setSvaccountno(getXMLValueByTag(document, "svaccountno"));
                cardInfo.setAccountstate(getXMLValueByTag(document, "accountstate"));
                cardInfo.setCurrencyid(getXMLValueByTag(document, "currencyid"));
                cardInfo.setCardstate(getXMLValueByTag(document, "cardstate"));
                cardInfo.setAccountno(getXMLValueByTag(document, "accountno"));
                cardInfo.setFirstname(getXMLValueByTag(document, "firstname"));
                cardInfo.setSecondname(getXMLValueByTag(document, "secondname"));
                cardInfo.setSurname(getXMLValueByTag(document, "surname"));
                cardInfo.setIdentifycode(getXMLValueByTag(document, "identifycode"));
                cardInfo.setBirthdate(getXMLValueByTag(document, "birthdate"));
                cardInfo.setDocumentno(getXMLValueByTag(document, "documentno"));
                cardInfoResponse.setCardInfo(cardInfo);
                responseMetaData.setStatus(ResponseStatus.OK);
            } else {
                responseMetaData.setStatus(ResponseStatus.ERROR);
                responseMetaData.setError("Data not found");
            }
        }
        return cardInfoResponse;
    }
}
