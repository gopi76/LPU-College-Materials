package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int id;
    char grade;
    
    public Student(String name, int id, char grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class FlatmapDemo3 {
    public static void main(String[] args){
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Sravan", 1, 'A'));
        studentList1.add(new Student("Datthu", 2, 'A'));
        studentList1.add(new Student("Lithin", 3, 'A'));
        
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Naga", 4, 'A'));
        studentList2.add(new Student("Datta", 5, 'A'));
        studentList2.add(new Student("Sunkara", 6, 'A'));
        
        List<List<Student>> studentList = Arrays.asList(studentList1, studentList2);
        studentList.stream().flatMap(str -> str.stream()).forEach(str -> System.out.println(str.name));
        
    }
}
