package DateandTime;

//import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();

        LocalDate dob = LocalDate.parse(dobString);
        System.out.println("Day of birth: " + dob.getDayOfWeek());

        
        LocalDate today = LocalDate.now();
        Period period = Period.between(dob, today);
        int ageInYears = period.getYears();

        System.out.println("Age: " + ageInYears);
    }
}
