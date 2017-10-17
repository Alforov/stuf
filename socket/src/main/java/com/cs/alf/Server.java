package com.cs.alf;

/**
 * Created by mikhail_alferov on 13.05.2017.
 */
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
       // System.out.println("Welcome to Server side");
        BufferedReader in = null;
        PrintWriter    out= null;

        ServerSocket servers = null;
        Socket       fromclient = null;

        // create server socket
        try {
            servers = new ServerSocket(9999);
        } catch (IOException e) {
         //   System.out.println("Couldn't listen to port 4444");
            System.exit(-1);
        }

        try {
        //    System.out.print("Waiting for a client...");
            fromclient= servers.accept();
        //    System.out.println("Client connected");
        } catch (IOException e) {
          //  System.out.println("Can't accept");
            System.exit(-1);
        }

        in  = new BufferedReader(new
                InputStreamReader(fromclient.getInputStream()));
        out = new PrintWriter(fromclient.getOutputStream(),true);
        String         input,output;
        //   System.out.println("Wait for messages");
        while ((input = in.readLine()) != null) {
           // if (input.equalsIgnoreCase("exit")) break;
          //  out.println("S ::: "+input);
           System.out.println(input);
        }
        out.append("HTTP/1.1 200 OK\n" +
                "Server: Microsoft-IIS/4.0\n" +
                "Date: Mon, 5 Jan 2004 13:13:33 GMT Content-Type: text/html\n" +
                "Last-Modified: Mon, 5 Jan 2004 13:13:12 GMT Content-Length: 112\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>HTTP Response Example</title> </head>\n" +
                "<body>\n" +
                "Welcome to Brainy Software\n" +
                "</body>\n" +
                "</html>");
        out.flush();
        out.close();
        in.close();
        fromclient.close();
        servers.close();
    }
}