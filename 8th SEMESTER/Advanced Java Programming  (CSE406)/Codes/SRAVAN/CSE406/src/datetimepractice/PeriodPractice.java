

import java.time.Period;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Duration;
import java.time.Instant;

public class PeriodPractice {
    public static void main(String[] args) throws InterruptedException{
//        Instant start = Instant.now();
//        Instant end = Instant.now();
//        Duration duration = Duration.between(start, end);
//        
//        LocalDateTime a = LocalDateTime.now();
//        Thread.sleep(2000);
//        LocalDateTime b = LocalDateTime.now();
//        Duration duration1 = Duration.between(a, b);
//        System.out.println(duration1);

        LocalDate now = LocalDate.now();
        LocalDate then = now.minusDays(5);
        Period period = Period.between(then, now);
        System.out.println(period.getDays());
        System.out.println(Period.of(7, 7, 8));
    }
}
