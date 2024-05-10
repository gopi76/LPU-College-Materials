import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        
        LocalDateTime todayNow = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + todayNow);

        
        LocalTime time = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS a");
        System.out.println("Formatted Current Time: " + time.format(timeFormatter));

       
        LocalDateTime myDate = LocalDateTime.parse("2024-04-09T13:48");
        System.out.println("Parsed LocalDateTime: " + myDate);
    }
}
