

import java.util.*;

public class CalendarDemo {
    public static void main(String[] args){
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.getTime());
        
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
        
        
    }
}
