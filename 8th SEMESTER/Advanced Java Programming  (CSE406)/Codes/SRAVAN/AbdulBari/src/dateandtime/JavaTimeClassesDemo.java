

import java.time.*;

public class JavaTimeClassesDemo {
    public static void main(String[] args){
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
        System.out.println();
        
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);
        System.out.println();
        
        OffsetTime ost = OffsetTime.now();
        System.out.println(ost);
        System.out.println();
        
        MonthDay md = MonthDay.now();
        System.out.println(md);
        System.out.println(md.atYear(2002));
    }
}
