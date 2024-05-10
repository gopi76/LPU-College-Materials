

import java.time.format.*;
import java.time.*;

public class DateFormatDemo {
    public static void main(String[] args){
        ZonedDateTime dt = ZonedDateTime.now();

       
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z");

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss z");

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss z");

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss z");
        
        System.out.println(df.format(dt));
        System.out.println(df1.format(dt));
        System.out.println();
        System.out.println(df2.format(dt));
        System.out.println(df3.format(dt));
    }
       
       
}
