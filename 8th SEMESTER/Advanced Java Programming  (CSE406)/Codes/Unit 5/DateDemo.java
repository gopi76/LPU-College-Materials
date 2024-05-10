import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.Period;
import java.util.Scanner;

class DateDemo {
    public static void main(String[] args) {

    	//LocalDate date = LocalDate.of(2024,2,29);
    	LocalDate date4 = LocalDate.now();
    	System.out.println(date4);


        LocalTime time = LocalTime.of(2,9,30);
    	//LocalTime time = LocalTime.now();
    	System.out.println(time);



        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date2 = LocalDate.parse("2024-01-06");
        System.out.println(date2);

        //LocalDate date1 = LocalDate.parse("2024/11/31");
        //System.out.println(date1);




        LocalTime time1 = LocalTime.parse("15:30:40.5000");
        System.out.println(time1);


        System.out.println("Task");

        //LocalDate dob = LocalDate.parse("2002-12-03");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the date in this format only [ YYYY-MM-DD ] : \t");
        String db = sc.next();

        LocalDate dob = LocalDate.parse(db);



        DayOfWeek dayOfWeek1 = dob.getDayOfWeek();
        System.out.println("You were born on : " + dayOfWeek1 );

        Period age = Period.between(dob, date4);
        int years = age.getYears();
        System.out.println("Age: " + years + " years " +age.getMonths() + " Months " + age.getDays()+ " Days");


        for(DayOfWeek d: DayOfWeek.values())
            System.out.println(d +"\t");

        //calendar like monday to sunday

        LocalDate date = LocalDate.now(); 
        
        
        LocalDate firstDayOfMonth = date.withDayOfMonth(1);
        DayOfWeek dayOfWeek = firstDayOfMonth.getDayOfWeek();
        int dayOfWeekValue = dayOfWeek.getValue();
        
        System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        
        
        for (int i = 1; i < dayOfWeekValue; i++) {
            System.out.print("      ");
        }
        
        
        int dayOfMonth = 1;
        while (dayOfMonth <= date.lengthOfMonth()) {
            
            System.out.printf("%5d", dayOfMonth);
            
            
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
            dayOfWeekValue = firstDayOfMonth.getDayOfWeek().getValue();
            
            if (dayOfWeekValue == 7) {
                System.out.println();
            }
            
            
            
            dayOfMonth++;
        }


        

    }
}
