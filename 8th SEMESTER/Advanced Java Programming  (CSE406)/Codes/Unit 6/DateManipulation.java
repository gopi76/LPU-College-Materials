import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the initial date
        System.out.println("Enter the initial date (YYYY-MM-DD):");
        String inputDateStr = scanner.nextLine();

        // Prompt user to enter the number of years, months, and days to add
        System.out.println("Enter the number of years to add:");
        int yearsToAdd = scanner.nextInt();

        System.out.println("Enter the number of months to add:");
        int monthsToAdd = scanner.nextInt();

        System.out.println("Enter the number of days to add:");
        int daysToAdd = scanner.nextInt();

        scanner.close(); // Close the scanner

        // Parse input date
        LocalDate inputDate = LocalDate.parse(inputDateStr);

        // Calculate new date after adding years, months, and days
        LocalDate newDate = inputDate.plusYears(yearsToAdd).plusMonths(monthsToAdd).plusDays(daysToAdd);
        System.out.println("Date after adding " + yearsToAdd + " years, " + monthsToAdd + " months, and " + daysToAdd + " days: " + newDate);

        // Find the first Monday in the next year
        LocalDate nextYear = inputDate.plusYears(1);
        LocalDate firstMondayNextYear = nextYear.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday in the next year: " + firstMondayNextYear);

        // Find the date of the previous Friday
        LocalDate previousFriday = inputDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println("Date of the previous Friday: " + previousFriday);
    }
}
