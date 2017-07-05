package ua.com.csltd.upbs.registry;

import org.springframework.web.multipart.MultipartFile;

public class Registry {
    private long pointId;
    private long billerId;
    private String request;
    private long idTerminal;
    private long typeTPP;
    private String nameTPP;
    private String regionTPP;
    private String cityTPP;
    private String addressTPP;
    private String ownerTPP;
    private String processingTPP;
    private String response;
    private String responseType;
    private String signStorePassword;
    private String alias;
    private String privateKeyPassword;
    private long port;
    private String ip;
    private String clientId;
    private MultipartFile path;

    public String getResponseType() {
        return this.responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public long getIdTerminal() {
        return this.idTerminal;
    }

    public void setIdTerminal(long idTerminal) {
        this.idTerminal = idTerminal;
    }

    public long getTypeTPP() {
        return this.typeTPP;
    }

    public void setTypeTPP(long typeTPP) {
        this.typeTPP = typeTPP;
    }

    public String getNameTPP() {
        return this.nameTPP;
    }

    public void setNameTPP(String nameTPP) {
        this.nameTPP = nameTPP;
    }

    public String getRegionTPP() {
        return this.regionTPP;
    }

    public void setRegionTPP(String regionTPP) {
        this.regionTPP = regionTPP;
    }

    public String getCityTPP() {
        return this.cityTPP;
    }

    public void setCityTPP(String cityTPP) {
        this.cityTPP = cityTPP;
    }

    public String getAddressTPP() {
        return this.addressTPP;
    }

    public void setAddressTPP(String addressTPP) {
        this.addressTPP = addressTPP;
    }

    public String getOwnerTPP() {
        return this.ownerTPP;
    }

    public void setOwnerTPP(String ownerTPP) {
        this.ownerTPP = ownerTPP;
    }

    public String getProcessingTPP() {
        return this.processingTPP;
    }

    public void setProcessingTPP(String processingTPP) {
        this.processingTPP = processingTPP;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public MultipartFile getPath() {
        return this.path;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSignStorePassword() {
        return this.signStorePassword;
    }

    public void setSignStorePassword(String signStorePassword) {
        this.signStorePassword = signStorePassword;
    }

    public String getPrivateKeyPassword() {
        return this.privateKeyPassword;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    public void setPath(MultipartFile path) {
        this.path = path;
    }

    public long getPointId() {
        return this.pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public long getBillerId() {
        return this.billerId;
    }

    public void setBillerId(long billerId) {
        this.billerId = billerId;
    }

    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public long getPort() {
        return this.port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}