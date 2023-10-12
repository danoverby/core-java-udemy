package CJT;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {
    public void test() {
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/mm/dd");
        System.out.println(sd.format(d) + "Year month day");
    }
    public void myCalendar() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sd.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
