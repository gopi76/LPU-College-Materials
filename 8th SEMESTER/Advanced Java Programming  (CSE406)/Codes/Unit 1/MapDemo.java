import java.util.*;
import java.util.stream.*;

class Contact
{
	String contact_name;
	long contact_number;
	public static ArrayList<Contact> phonebook = new ArrayList<>();
	Contact(String name, long con)
	{
		contact_name = name;
		contact_number = con;
		phonebook.add(this);
	}
}

class MapDemo
{
    static public void main(String [] rk)
    {
	ArrayList <Employee> al = new ArrayList<>();
	al.add(new Employee("Ravi", 10, 8437360391L));
	al.add(new Employee("ABC", 10, 8523760391L));
	al.add(new Employee("ZXV", 10, 85255660391L));
	al.add(new Employee("DFGH", 10, 844525285L));
	al.add(new Employee("FGHN", 10, 7852582525L));
	
	//Stream <Long> str = al.stream().map(emp -> emp.mobile);
	
	long num = al.stream().map(emp -> { Contact c = new Contact(emp.name, emp.mobile);
							//Contact.phonebook.add(c);
							return c;
						}
				).count();
	//List <Long> contacts = str.collect(Collectors.toList());
	//for(Long l : contacts) System.out.println(l);

	//Print the Phonebook

	System.out.println(Contact.phonebook);
	for(Contact c: Contact.phonebook) 
		System.out.println(c.contact_name + "\t"+ c.contact_number);
    }
}


class Employee
{
	String name;
 	long mobile;
	int salary;
	Employee(String n, int s, long m)
	{
		name = n; salary = s; mobile = m;
	}
}


