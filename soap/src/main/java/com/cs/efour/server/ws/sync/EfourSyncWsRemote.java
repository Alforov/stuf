package com.cs.efour.server.ws.sync;

import java.rmi.Remote;

public interface EfourSyncWsRemote extends Remote {
	public String call(String input);
	public String callCompressed(String input) throws Exception;
}