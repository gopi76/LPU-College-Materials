import java.time.*;
import java.time.format.*;
import java.util.*;


class DateFormatter {
	public static void main(String[] args) {
		System.out.print("enter the date : ");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt = LocalDate.parse(str, format);

		System.out.println("user typed date : "+ dt);

		String res = dt.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
		System.out.println("changed the date format : "+ res);

       System.out.println("another date format : ");
       LocalDate d = LocalDate.parse(res, DateTimeFormatter.ofPattern("dd-MMM-yy"));
       System.out.println(d);


	}
}