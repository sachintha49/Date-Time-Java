import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInputDateWithSplit {
    public static void main(String[] args) {
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
