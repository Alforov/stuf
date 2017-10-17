import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

/**
 * Created by mikhail_alferov on 13.10.2017.
 */
public class TestClass {
    public static void main(String[] args) throws Exception {

        KeyStore p12 = KeyStore.getInstance("pkcs12");
        p12.load(new FileInputStream("cs_integra_ltd.p12"), "?+R(2~k".toCharArray());
        Enumeration e = p12.aliases();
        while (e.hasMoreElements()) {
            String alias = (String) e.nextElement();
            X509Certificate c = (X509Certificate) p12.getCertificate(alias);
            Principal subject = c.getSubjectDN();
            String subjectArray[] = subject.toString().split(",");
            for (String s : subjectArray) {
                String[] str = s.trim().split("=");
                String key = str[0];
                String value = str[1];
                System.out.println(key + " - " + value);
            }
        }
    }
}