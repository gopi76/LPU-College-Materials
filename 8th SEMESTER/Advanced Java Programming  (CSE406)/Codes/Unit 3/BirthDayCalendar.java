import java.time.LocalDate;

public class BirthDayCalendar {

    public static void main(String[] args) {
        // Your existing main method code remains unchanged
    }

    public static void printCalendar(int year, int month) {
        // Create LocalDate object for the first day of the month
        LocalDate date = LocalDate.of(year, month, 1);

        // Get the day of the week for the first day (Sunday = 0, Saturday = 6)
        int firstDayOfWeek = date.getDayOfWeek().getValue();

        // Print header row
        System.out.println("  Su Mo Tu We Th Fr Sa");

        // Print leading spaces before the first day
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print days of the month with padding
        int daysInMonth = date.lengthOfMonth();
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDayOfWeek) % 7 == 0 || i == daysInMonth) {
                System.out.println();
            }
        }
    }
}
