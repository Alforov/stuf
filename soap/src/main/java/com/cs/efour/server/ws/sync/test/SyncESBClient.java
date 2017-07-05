package com.cs.efour.server.ws.sync.test;

import com.cs.efour.server.ws.sync.EfourSyncWs;

import javax.xml.ws.Endpoint;

public class SyncESBClient {
    public static void main(String[] args) throws Exception {
        Endpoint.publish("http://localhost:8080/sync/EfourSyncWs", new EfourSyncWs());
    }
}
