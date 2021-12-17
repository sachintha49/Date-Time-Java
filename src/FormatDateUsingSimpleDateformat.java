import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateUsingSimpleDateformat {
    public static void main(String[] args) {
        Date today = new Date();
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(today);
        System.out.println(formattedDate);
    }
}
