/*
 * Date and Time
 * --------------------------------
 * Date, Time => java.util.Date()
 * Calender
 * Date => java.time.LocalDate
 * Time => java.time.LocalTime
 * Date, Time => java.time.LocalDateTime
 * Date => java.sql.Date
 * Time => java.sql.Time
 *
 * */


import java.util.Calendar;
import java.util.Date;

public class DateTesting {
    public static void main(String[] args) {

        System.out.println(new Date());
        // 2021-09-23

        System.out.println(String.format("%1$tY-%1$tm-%1$td", new Date()));
        // HH-MM-SS

        System.out.println(String.format("%1$tH-%1$tM-%1$tS", new Date()));

        // Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date
        System.out.println(new Date().getTime());

        /*If we want to get the date using calendar we can do like this. specific date or today date */
        Calendar c = Calendar.getInstance();
        c.set(2021, 3, 23);
        System.out.println(String.format("%1$tY-%1$tm-%1$td", c));

        /* Today date we can get from getting milliseconds from Calendar class. we have to pass calendar object to Date constructor*/
        Date date = new Date(Calendar.getInstance().getTimeInMillis());
        System.out.println(String.format("%1$tY-%1$tm-%1$td", date));



    }
}
