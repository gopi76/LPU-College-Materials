

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args){
//        LocalDate localDate = LocalDate.now();
//        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String format = localDate.format(myFormatter);
//        System.out.println(format);
        
        String date = "25/04/1998";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);
    }
}
