import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

import java.util.Scanner;

public class BirthdayDayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their date of birth
        System.out.println("Enter your date of birth (YYYY-MM-DD):");
        String dobInput = scanner.nextLine();

        // Parse the user input into a LocalDate object
        LocalDate dob = LocalDate.parse(dobInput, DateTimeFormatter.ISO_DATE);

        System.out.println((dob));

        // Get the day of the week for the date of birth
        DayOfWeek dayOfWeekOfBirth = dob.getDayOfWeek();
        System.out.println("You were born on a " + dayOfWeekOfBirth);

        // Calculate the date of the 21st birthday
        LocalDate twentyFirstBirthday = dob.plusYears(21);

        // Get the day of the week for the 21st birthday
        DayOfWeek dayOfWeekOfTwentyFirstBirthday = twentyFirstBirthday.getDayOfWeek();
        System.out.println("Your 21st birthday falls on a " + dayOfWeekOfTwentyFirstBirthday);

        scanner.close();
    }
}
