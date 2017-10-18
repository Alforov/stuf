package com.cs.alf;

/**
 * Created by mikhail_alferov on 13.05.2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        // System.out.println("Welcome to Server side");


        ServerSocket servers = null;
        Socket fromclient = null;

        // create server socket

        servers = new ServerSocket(9999);


        //    System.out.print("Waiting for a client...");
        while (true) {
            final Socket finalFromclient = servers.accept();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        BufferedReader in = null;
                        PrintWriter out = null;
                        in = new BufferedReader(new
                                InputStreamReader(finalFromclient.getInputStream()));
                        out = new PrintWriter(finalFromclient.getOutputStream(), true);
                        String input;
                        System.out.println("---------START----------------");
                        while ((input = in.readLine()) != null) {
                            System.out.println(input);
                        }
                        System.out.println("----------END---------------");
                        System.out.println("----------------------------");
                        out.close();
                        in.close();
                        finalFromclient.close();
                    } catch (Exception e) {

                    }

                }
            }).start();
            //    System.out.println("Client connected");
        }

    }
}