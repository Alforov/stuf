import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mikhail_alferov on 05.10.2017.
 */
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timestamp yyMM = new Timestamp(new SimpleDateFormat("yyMM").parse("1710").getTime());
        System.out.println(new Date(yyMM.getTime()));
        Integer o = null;
        if (o != 1) {

        }
    }
}
