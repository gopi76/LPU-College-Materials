import java.util.*;
import java.util.stream.*;

class Student {
	String name;
	int id;
	int salary;
	String country;

	public Student(String name, int id, int salary, String country) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.country = country;
    }
}

class Comparator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add("Gopi",3, 20000, India);
		al.add("ravi",4, 30000, US);
		al.add("suri",5, 40000, canada);
        al.add("Giri",6, 50000, India);

        Stream<Student>str = al.stream().filter(s -> s.country.equals("India"));
        //System.out.println("name\tid")
        str.forEach(x -> System.out.println(x.name+"\t"+x.id +"\t"+x.salary+"\t"+x.country));



	}
}