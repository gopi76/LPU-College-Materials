import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student {
    private String name;
    private int id;
    private int salary;
    private String country;

    public Student(String name, int id, int salary, String country) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list to store Student objects
        List<Student> studentList = new ArrayList<>();

        // Add Student objects to the list
        studentList.add(new Student("Gopi", 3, 20000, "India"));
        studentList.add(new Student("Ravi", 4, 30000, "US"));
        studentList.add(new Student("Suri", 5, 40000, "Canada"));
        studentList.add(new Student("Giri", 6, 50000, "India"));

        // Use Stream API to filter and print details of students from India
        Stream<Student> filteredStudents = studentList.stream()
                .filter(s -> s.getCountry().equals("India"));

        // Print the details of filtered students
        filteredStudents.forEach(s -> System.out.println(s.getName() + "\t" + s.getId() + "\t" + s.getSalary() + "\t" + s.getCountry()));
    }
}
