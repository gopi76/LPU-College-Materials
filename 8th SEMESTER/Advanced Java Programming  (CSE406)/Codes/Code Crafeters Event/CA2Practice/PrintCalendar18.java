import java.util.*;
import java.time.*;
class PrintCalendar18
{
    static public void main(String[] rk)
    {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int y = sc.nextInt();

	LocalDate d = LocalDate.of(y, m, 8);
	int v = d.getDayOfWeek().getValue();
	
	System.out.println("\tMon\tTue\tWed\tThur\tFri\tSat\tSun");
	for(int i=1; i<v; i++) System.out.print("\t  ");

	for(int i = 1; i <= d.lengthOfMonth(); i++)
	{
		System.out.print( "\t" + i );
		v++;
		if((v-1) %7 == 0) System.out.println();

	}
	
    }
}

