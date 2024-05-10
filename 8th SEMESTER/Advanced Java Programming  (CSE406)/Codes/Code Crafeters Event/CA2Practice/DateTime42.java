import java.time.*;
import java.util.*;
import java.time.temporal.*;

/*Print the Dates of all the Saturday in the Next Month*/

class DateTime42
{
    static public void main(String[] rk)
    {
	LocalDate today = LocalDate.now();
	today = today.plusMonths(1).withDayOfMonth(1);
	LocalDate nextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
	
	for(int i= 1; i<=5; i++)
	{

		LocalDate saturday = today.with(TemporalAdjusters.dayOfWeekInMonth(i, DayOfWeek.SATURDAY));
		if(saturday.isBefore(nextMonth))
			System.out.println(saturday); 
	}	



/*
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter your DoB in YYYY-MM-DD format");
	String db = sc.next();

	//LocalDate dob = LocalDate.of(2001, 11, 31);

	LocalDate dob = LocalDate.parse(db);
	
	System.out.println(dob);
	
	LocalDate today = LocalDate.now();

	Period age = Period.between(dob, today);
	
	System.out.println("You were born on "+ dob.getDayOfWeek());
	System.out.println("Your age is " + age.getYears() + " Saal " + age.getMonths() + " Mahine "
	+ age.getDays() + " Din!");
*/
    }
}