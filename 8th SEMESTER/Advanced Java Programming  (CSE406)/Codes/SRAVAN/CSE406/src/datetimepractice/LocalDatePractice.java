

import java.time.LocalDate;
import java.time.Month;

public class LocalDatePractice {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("Today: "+today);
        
        LocalDate customDate = LocalDate.of(2024,2,4);
        System.out.println("Custom date: "+customDate);
        
        int dayOfMonth = today.getDayOfMonth();
        System.out.println("Day of month: "+dayOfMonth);
        
        Month month = today.getMonth();
        System.out.println("Month: "+month);
        
        int monthNumber = today.getMonthValue();
        System.out.println("Month number: "+monthNumber);
        
        int year = today.getYear();
        System.out.println("Year: "+year);
        
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Yesterday: "+yesterday);
        
        LocalDate pastWeek = today.minusWeeks(2);
        System.out.println("Past day in the week: "+pastWeek);
        
        LocalDate pastMonth = today.minusMonths(2);
        System.out.println("Past day in the month: "+pastMonth);
        
        LocalDate pastYear = today.minusYears(2);
        System.out.println("Past day in the year: "+pastYear);
        
        if(today.isAfter(yesterday)){
            System.out.println("yes");
        }


        if (today.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Get the number of days in the current year
        int daysInYear = today.lengthOfYear();
        System.out.println("Number of days in the year " + year + ": " + daysInYear);



        // Get the day of the year (1-based index)
        int dayOfYear = today.getDayOfYear();

        

        // Format the day of the year with the suffix (e.g., "250th day")
        String formattedDayOfYear = dayOfYear + " day";

        // Print the formatted day of the year
        System.out.println("Day of the year: " + formattedDayOfYear);

    }
}
