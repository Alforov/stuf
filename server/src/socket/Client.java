package socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by mikhail_alferov on 26.07.2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {

        try (Socket fromServer = new Socket("localhost", 8090); OutputStream os = fromServer.getOutputStream(); InputStream is = fromServer.getInputStream()) {
            DataInputStream in = new DataInputStream(is);
            DataOutputStream out = new DataOutputStream(os);
            out.writeUTF("GET /swagger-ui.html HTTP/1.1 \\r\\n\\r\\n");
            out.flush();
            System.out.println(in.readUTF());
        }
    }
}