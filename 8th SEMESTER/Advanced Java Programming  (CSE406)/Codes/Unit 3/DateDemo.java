import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();

        
        LocalDate dob = LocalDate.parse(dobInput);

        
        DayOfWeek dayOfWeek = dob.getDayOfWeek();
        System.out.println("You were born on a " + dayOfWeek);

        
        int year = dob.getYear();
        printCalendar(year);

        scanner.close();
    }

    
    public static void printCalendar(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd E");

        System.out.println("Calendar for Year " + year + ":");
        System.out.println("MM/DD Day");

        while (date.getYear() == year) {
            System.out.println(date.format(formatter));
            date = date.plusDays(1);
        }
    }
}
