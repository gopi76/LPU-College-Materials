import java.sql.*;


/*
create database KE019;
use KE019;
create table student(name varchar(20), roll int, cgpa double);
*/

class JDBCTest
{
    static public void main(String[] rk) {

	try {
	Connection con=
	    DriverManager.getConnection("jdbc:mysql://localhost:3306/KE019", "root", "Ravi@1987");  

	Statement stmt = con.createStatement();
	
	stmt.executeUpdate("insert into student values (\"Ravi Kant Sahu\", 535, 7.98)");
	
  	 }
	catch(Exception ex) { System.out.println(ex); }
	
   }
}