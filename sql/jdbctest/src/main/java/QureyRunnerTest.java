import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by mikhail_alferov on 11.08.2017.
 */
public class QureyRunnerTest {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@kerberos:1521:DEV";

    //  Database credentials
    static final String USER = "ifobs";
    static final String PASS = "ifobs";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;

        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        System.out.println("Connecting to database...");
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        setAlternateIdIsPossible(new BigDecimal(154620),new BigDecimal(3000132),connection);
    }

    public static void setAlternateIdIsPossible(BigDecimal contragentId, BigDecimal branchId, Connection connection) {
        try {
            Object[] params = {contragentId, branchId};
            String result = (String) new QueryRunner().query(connection,
                    "  SELECT   pib.alternateid\n" +
                            "    FROM   PIB_CONTRAGENT_ALTER pib \n" +
                            "   WHERE   pib.contragentid = ? and pib.siteid = ?", params,
                    new ScalarHandler()
            );
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println("empty");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

