package JavaIOStreams;

import java.io.*;

class StudentPSWD{
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamWritingData {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/srava/Documents/MyJava/Student1.txt");
            PrintStream ps = new PrintStream(fos);
            
            StudentPSWD s = new StudentPSWD();
            s.rollNo = 10;
            s.name = "John";
            s.dept = "CSE";
            
            ps.println(s.rollNo);
            ps.println(s.name);
            ps.println(s.dept);
            
            ps.close();
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
