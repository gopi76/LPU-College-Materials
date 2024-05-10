package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    int age;
    
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class MapDemo3 {
    public static void main(String[] args){
        List<Employee> employeeList = Arrays.asList(new Employee("Sravan", 21), new Employee("Lithin", 22), new Employee("Datthu", 15));
        
        List<String> employeeNames = employeeList.stream().filter(emp -> emp.age>20).map(emp -> emp.name.toUpperCase()).collect(Collectors.toList());
        
        System.out.println(employeeNames);
    }
}
