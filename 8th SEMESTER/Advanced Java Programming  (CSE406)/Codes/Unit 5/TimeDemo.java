import java.util.*;
import java.time.format.*;
import java.time.*;
import java.time.temporal.*;

class TimeDemo {
	public static void main(String[] args) {

		LocalTime t = LocalTime.now();
		System.out.println(t);  //normal 24 hr format

                                                        //hour: minute : am or pm
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(t.format(dt)); //12 hour format

		DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("kk:mm:a");
		System.out.println(t.format(dt1));

		DateTimeFormatter dt3 = DateTimeFormatter.ofPattern("KK:mm:a");
		System.out.println(t.format(dt3));

		System.out.println("Sample func with DAte ");

		LocalDate today1  = LocalDate.now();
		System.out.println(today1.with(TemporalAdjusters.lastInMonth(DayOfWeek.WEDNESDAY)));

		LocalDate today  = LocalDate.now();
		for(int i=1;i<8;i++)
		System.out.println(today.with(TemporalAdjusters.dayOfWeekInMonth(i,DayOfWeek.SUNDAY)));

	}
}