package registry;

import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.Key;
import java.security.PrivateKey;
import java.security.KeyStore;
import java.net.ConnectException;
import java.io.OutputStream;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.io.ByteArrayOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyPair;
import sun.misc.BASE64Encoder;
import java.security.Signature;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.Map;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.File;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class RegistryController
{
    private Integer connectionCount;

    public RegistryController() {
        this.connectionCount = 1;
    }

    @GetMapping({ "/registry" })
    public String greetingForm(final Model model) {
        model.addAttribute("registry", (Object)new Registry());
        return "greeting";
    }

    @GetMapping({ "/exit" })
    public void exit(final Model model) {
        System.exit(1);
    }

    @PostMapping({ "/registryPoint" })
    public String registryPoint(@ModelAttribute final Registry registry) {
        return this.processRequest(registry, true);
    }

    @PostMapping({ "/registryPartner" })
    public String registryPartner(@ModelAttribute final Registry registry) {
        return this.processRequest(registry, false);
    }

    private String processRequest(final Registry registry, final boolean isPoint) {
        try {
            final File jarPath = new File(RegistryController.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            final Properties properties = new Properties();
            properties.load(new FileInputStream(jarPath.getParentFile().getParentFile().getParentFile().getPath().replace("file:\\", "") + File.separator + "settings.properties"));
            System.getProperties().putAll(properties);
            this.createRequest(registry, isPoint);
        }
        catch (Exception e) {
            registry.setRequest(e.getMessage());
        }
        return "result";
    }

    private void createRequest(final Registry registry, final boolean isPoint) throws IOException {
        final String request = this.createRequestString(registry, isPoint);
        registry.setRequest(request);
        final String response = this.sendRequest(request, registry);
        String s = "";
        if (response == null || !response.startsWith("146;0")) {
            registry.setResponseType("\u041e\u0448\u0438\u0431\u043a\u0430 \u0432 \u0437\u0430\u043f\u0440\u043e\u0441\u0435");
        }
        else {
            final String[] array = response.split(";");
            if ("*".equals(array[2])) {
                final String s2 = array[1];
                if ("0".equals(s2)) {
                    registry.setResponseType("\u0437\u0430\u043f\u0440\u043e\u0441 \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d");
                }
                else if ("20".equals(s2)) {
                    registry.setResponseType("\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044f \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0430");
                }
                else {
                    registry.setResponseType("\u043d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u0430\u044f \u043e\u0448\u0438\u0431\u043a\u0430");
                }
            }
            else {
                final String s3;
                s = (s3 = array[7]);
                switch (s3) {
                    case "0": {
                        registry.setResponseType("\u0443\u0441\u043f\u0456\u0448\u043d\u043e \u0437\u0430\u0440\u0435\u0454\u0441\u0442\u0440\u043e\u0432\u0430\u043d\u043e");
                        break;
                    }
                    case "1": {
                        registry.setResponseType("\u0440\u0435\u0454\u0441\u0442\u0440\u0430\u0446\u0456\u044f \u043d\u0435 \u043f\u043e\u0442\u0440\u0456\u0431\u043d\u0430");
                        break;
                    }
                    case "2": {
                        registry.setResponseType("\u041f\u041f\u041f \u043d\u0435 \u0437\u0430\u0440\u0435\u0454\u0441\u0442\u0440\u043e\u0432\u0430\u043d\u0438\u0439 \u0432 \u0441\u0438\u0441\u0442\u0435\u043c\u0456 (\u0456 \u0442\u043e\u043c\u0443 \u0439\u043e\u0433\u043e \u043d\u0435 \u043c\u043e\u0436\u043d\u0430 \u0437\u0430\u0440\u0435\u0454\u0441\u0442\u0440\u0443\u0432\u0430\u0442\u0438 \u0434\u043b\u044f \u0441\u0435\u0440\u0432\u0456\u0441\u0443)");
                        break;
                    }
                    case "3": {
                        registry.setResponseType("\u041f\u041f\u041f \u0437\u0430\u0431\u043b\u043e\u043a\u043e\u0432\u0430\u043d\u0438\u0439 \u0432 \u0441\u0438\u0441\u0442\u0435\u043c\u0456 (\u0456 \u0442\u043e\u043c\u0443 \u0457\u0457 \u043d\u0435 \u043c\u043e\u0436\u043d\u0430 \u0437\u0430\u0440\u0435\u0454\u0441\u0442\u0440\u0443\u0432\u0430\u0442\u0438 \u0434\u043b\u044f \u0441\u0435\u0440\u0432\u0456\u0441\u0443)");
                        break;
                    }
                    case "4": {
                        registry.setResponseType("\u0432\u0456\u0434\u043c\u043e\u0432\u0430 \u0432 \u0440\u0435\u0454\u0441\u0442\u0440\u0430\u0446\u0456\u0457");
                        break;
                    }
                    default: {
                        registry.setResponseType("\u043d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0441\u0442\u0430\u0442\u0443\u0441");
                        break;
                    }
                }
            }
        }
        registry.setResponse(response);
    }

    private String sendRequest(final String request, final Registry registry) throws IOException {
        return this.processMessage(request, registry);
    }

    private String createRequestString(final Registry registry, final boolean isPoint) {
        final StringBuilder sb = new StringBuilder();
        if (isPoint) {
            sb.append("145;TPR;TPR;1;").append(registry.getPointId()).append(";").append(registry.getBillerId()).append(";");
        }
        else {
            sb.append("145;TPE;TPE;1;").append(registry.getIdTerminal()).append(";").append(registry.getTypeTPP()).append(";").append(registry.getNameTPP()).append(";").append(registry.getRegionTPP()).append(";").append(registry.getCityTPP()).append(";").append(registry.getAddressTPP()).append(";").append(registry.getOwnerTPP()).append(";").append(registry.getProcessingTPP()).append(";");
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        final String dateStr = simpleDateFormat.format(new Date());
        sb.append(dateStr);
        sb.append(";");
        sb.append(System.getProperty("flashChequeUniversal.clientId"));
        sb.append(";");
        return this.addSignToRequest(sb.toString(), registry);
    }

    private String addSignToRequest(final String s, final Registry registry) {
        String response;
        try {
            final KeyPair keyPair = this.getKeyPair(registry);
            final byte[] data = s.getBytes("cp1251");
            final Signature sig = Signature.getInstance("SHA1withRSA");
            sig.initSign(keyPair.getPrivate());
            sig.update(data);
            final byte[] signatureBytes = sig.sign();
            final String encode = new BASE64Encoder().encode(signatureBytes);
            System.out.println("Singature:" + encode);
            response = encode.replaceAll("\\r\\n", "");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return s + response;
    }

    public String processMessage(final String payload, final Registry registry) throws IOException {
        long operationTime = System.currentTimeMillis();
        final Socket socket = new Socket();
        ByteArrayOutputStream baos = null;
        final SocketAddress socketAddress = new InetSocketAddress(InetAddress.getByName(System.getProperty("flashChequeUniversal.ip")), Integer.valueOf(System.getProperty("flashChequeUniversal.port")));
        this.connect(socket, socketAddress, 0);
        try {
            final InputStream is = new BufferedInputStream(socket.getInputStream());
            final OutputStream os = new BufferedOutputStream(socket.getOutputStream());
            os.write(payload.getBytes("cp1251"));
            os.write(10);
            os.flush();
            final Integer bufferSize = 256;
            final byte[] buff = new byte[(int)bufferSize];
            baos = new ByteArrayOutputStream();
            int read;
            while ((read = is.read(buff)) != -1) {
                baos.write(buff, 0, read);
            }
            baos.flush();
            final byte[] respBytes = baos.toByteArray();
            if (respBytes.length == 0) {
                throw new SocketTimeoutException("FlashChequeUniversalOutGataway NULL response");
            }
            return new String(respBytes, "cp1251");
        }
        catch (IOException ioe) {
            final long time = System.currentTimeMillis() - operationTime;
            if (ioe instanceof SocketTimeoutException) {
                throw new SocketTimeoutException(ioe.toString() + " Duration: " + time / 1000L + " sec.");
            }
            throw new IOException(ioe.toString() + " Duration: " + time / 1000L + " sec.");
        }
        finally {
            operationTime = System.currentTimeMillis() - operationTime;
            try {
                if (baos != null) {
                    baos.close();
                }
            }
            catch (IOException ex) {}
            try {
                if (socket != null) {
                    socket.close();
                }
            }
            catch (IOException ex2) {}
        }
    }

    private void connect(final Socket socket, final SocketAddress socketAddress, int currectTry) throws ConnectException {
        if (currectTry < this.connectionCount) {
            Exception ex = null;
            try {
                final Integer soTimeout = 3000;
                socket.setSoTimeout(soTimeout);
                socket.setTcpNoDelay(true);
                socket.connect(socketAddress, soTimeout);
            }
            catch (IOException e) {
                ex = e;
                if (!(e instanceof SocketTimeoutException)) {
                    throw new ConnectException("FlashChequeUniversalOutGataway. Unable get connection: " + e.toString());
                }
                this.connect(socket, socketAddress, ++currectTry);
            }
            return;
        }
        throw new ConnectException(this.getClass().getSimpleName() + " - Unable get connection! Address: " + socketAddress);
    }

    public KeyPair getKeyPair(final Registry registry) throws Exception {
        final FileInputStream is = new FileInputStream(System.getProperty("keystore.path"));
        final KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        keystore.load(is, System.getProperty("upbs.signStore.password").toCharArray());
        final String alias = System.getProperty("flashChequeUniversal.private.key.sign.alias");
        final Key key = keystore.getKey(alias, System.getProperty("flashChequeUniversal.private.key.sign.password").toCharArray());
        if (key instanceof PrivateKey) {
            final Certificate cert = keystore.getCertificate(alias);
            final PublicKey publicKey = cert.getPublicKey();
            return new KeyPair(publicKey, (PrivateKey)key);
        }
        return null;
    }
}