import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {


    public static String timeConversion(String s) {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = null;
        try {
            date = parseFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return displayFormat.format(date);
    }

    @Test
    public void test(){
        System.out.println(timeConversion("07:05:45PM"));
    }
}
