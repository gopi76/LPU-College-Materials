

import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateDemoNew {
    public static void main(String[] args){
//        Date d = new Date();
//        System.out.println(d);
//        d.setHours(18);
//        System.out.println(d);

//        LocalDate d =  LocalDate.now();
        LocalDate d =  LocalDate.of(2024, Month.APRIL, 14);
        LocalDate d1 = d.plusMonths(5);
        LocalDate d2 = d1.minusMonths(5);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println();
        
        LocalTime t = LocalTime.now();
        LocalTime t1 = t.minusHours(3);
        System.out.println(t);
        System.out.println(t1);
        System.out.println();

        LocalTime t2 = t1.plusHours(6);
        System.out.println(t2);
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
