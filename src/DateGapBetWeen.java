import java.util.Calendar;
import java.util.Date;

public class DateGapBetWeen {
    public static void main(String[] args) {
        System.out.println("find date gaps between : 2021-05-20 -> 2021-04-02");
        Calendar c = Calendar.getInstance();
        c.set(2021,4,20);
        long t1 = c.getTimeInMillis();
        c.set(2021,3,2);
        long t2 = c.getTimeInMillis();
        System.out.println((t1 - t2) / 1000 / 60 / 60 / 24);

    }
}
