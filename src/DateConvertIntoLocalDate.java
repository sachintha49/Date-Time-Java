import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateConvertIntoLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid"));
        Date currentDate = calendar.getTime();
        System.out.println(currentDate);

    }
}
