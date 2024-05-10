import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimePractice {
    public static void main(String[] args) {
        // Get the current date and time in the default time zone
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Default Time Zone: " + now);

        // Specify time zones for other countries
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = now.withZoneSameInstant(newYorkZone);
        System.out.println("New York Time: " + newYorkTime);

        ZoneId londonZone = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = now.withZoneSameInstant(londonZone);
        System.out.println("London Time: " + londonTime);

        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZonedDateTime sydneyTime = now.withZoneSameInstant(sydneyZone);
        System.out.println("Sydney Time: " + sydneyTime);
    }
}
