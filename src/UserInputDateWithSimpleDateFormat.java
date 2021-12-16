import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInputDateWithSimpleDateFormat {
    public static void main(String[] args) {
        /* User enter the date as string. how we can convert this into Date object */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the date [YYY-MM-DD] :");
            String input = scanner.nextLine();

            try {
                Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(input);
                System.out.println(parsedDate);
                break;
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
}
