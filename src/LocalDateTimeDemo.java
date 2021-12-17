import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // 2021-March-22
        String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyy-LLLL-dd"));
        System.out.println(formattedDate);

        // if we want to make our own like date
        LocalDate today2 = LocalDate.of(2021, 12, 11);
        System.out.println(today2);

        // if we have user enter string how do we convert into LocalDate class?
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the date [YYYY-MM-DD]");
            String input = scanner.nextLine();

            try {
                LocalDate parseDate = LocalDate.parse(input);
                System.out.println(parseDate);
                break;
            }catch (DateTimeParseException ex){
                System.out.println("Invalid date please try again!");
            }
        }

        // If we want to add some days to a another date we can easily use LcalDate class
        // new method using LocalDate
        System.out.println(" Using new LocalDate :"+today.plusDays(10));


        // old method
        Date oldAddDate = new Date(new Date().getTime() + (10 * 24* 60 * 60 * 1000));
        System.out.println(oldAddDate);


    }
}
