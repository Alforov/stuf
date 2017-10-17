package inheritance;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mikhail_alferov on 14.09.2017.
 */
public class Test {
    private static Timestamp expirationDate;

    public static void main(String[] args) throws Exception {
        setExpYYMM("1810");
        System.out.println(expirationDate);
        System.out.println(new SimpleDateFormat("yyMM").format(expirationDate));
        System.out.println(Test.getTimestampAsString("dd-MM-yyyy", expirationDate));
    }

    public static void setExpYYMM(String expYYMM) {
        if (expYYMM != null) {
            try {
                Date yyMM = new SimpleDateFormat("yyMM").parse(expYYMM);
                Calendar instance = Calendar.getInstance();
                instance.setTime(yyMM);
                instance.set(Calendar.DAY_OF_MONTH, instance.getActualMaximum(Calendar.DAY_OF_MONTH));
                expirationDate  = new Timestamp(instance.getTimeInMillis());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } else {
            expirationDate = null;
        }
    }

    public static String getTimestampAsString(final String format, final java.util.Date date) throws Exception {
        if ((format == null) || (date == null)) {
            return null;
        }
//    final Date today = new Date(date.getTime());
        final DateFormat formatter = new SimpleDateFormat(format);
        final String dateNewFormat = formatter.format(date);
        return dateNewFormat;
    }
}
