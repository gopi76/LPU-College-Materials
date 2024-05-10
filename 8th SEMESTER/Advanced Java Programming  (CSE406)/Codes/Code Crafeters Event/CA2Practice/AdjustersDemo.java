import java.time.*;
import java.time.temporal.*;

class AdjustersDemo
{
    static public void main(String [] tk)
    {
	LocalDate d = LocalDate.parse("2002-12-01");
	LocalDate fs = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));
	LocalDate ls = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));

	System.out.println("First Saturday of this Month: " + fs);
	System.out.println("Last Saturday of this Month: " + ls);

	System.out.println("Printing all SUNDAYS\n");
	for(int i=1; i<=5; i++)
		System.out.println(d.with(TemporalAdjusters.dayOfWeekInMonth(i, DayOfWeek.MONDAY)));

    }
}



