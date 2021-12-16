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
import java.util.Scanner;

public class Test {
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

        /* User enter the date as string. how we can convert this into Date object */
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the date [YYYY-MM-DD]");
            String input = scanner.nextLine();
            String[] split = input.split("-");
            if (split.length != 3) {
                System.out.println("Invalid date please try again!");
            } else {
                Calendar usrDate = Calendar.getInstance();
                usrDate.set(Integer.parseInt(split[0]),Integer.parseInt(split[1]) - 1,Integer.parseInt(split[2]));
                System.out.println(String.format("%1$tY-%1$tm-%1$td", usrDate.getTime())); // this return Date object
                Date newDateObj = usrDate.getTime();
                // convert user input object into Date class
                System.out.println(newDateObj);
                break;
            }
        }

    }
}
