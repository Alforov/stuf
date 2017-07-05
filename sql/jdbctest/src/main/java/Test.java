import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Base64;

/**
 * Created by mikhail_alferov on 30.06.2017.
 */
public class Test {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@kerberos:1521:DEV";

    //  Database credentials
    static final String USER = "ifobsbf";
    static final String PASS = "ifobs";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        //STEP 4: Execute a query
        System.out.println("Creating statement...");
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT udt.BILLERXML " +
                "  FROM upbsdoctemplate udt ";

        ResultSet rs = stmt.executeQuery(sql);
        StringBuilder stringBuilder = new StringBuilder();
        //STEP 5: Extract data from result set
        int countBill =  0;
        int countBiller =  0;
        while (rs.next()) {
            Clob last = rs.getClob("billerxml");
            if (last != null) {
                InputStream asciiStream = last.getAsciiStream();
                int available = asciiStream.available();
                byte[] bytes = new byte[available];
                asciiStream.read(bytes);
                String result = new String(Base64.getDecoder().decode(bytes));
                if (result.contains("class=\"ua.com.cs.ifobs.model.upbs.UpbsBill\">")) {
                 //   System.out.println(result);
                    countBill++;
                } else if (result.contains("class=\"ua.com.cs.ifobs.model.upbs.UpbsBiller\">")) {
                    countBiller++;
                }
               stringBuilder.append(result);
            }
        }
        System.out.println("countBill: " + countBill);
        System.out.println("countBiller: " + countBiller);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("result.txt"));
        fileOutputStream.write(stringBuilder.toString().getBytes());
        //STEP 6: Clean-up environment
        fileOutputStream.close();
        rs.close();
        stmt.close();
        conn.close();
    }
}

