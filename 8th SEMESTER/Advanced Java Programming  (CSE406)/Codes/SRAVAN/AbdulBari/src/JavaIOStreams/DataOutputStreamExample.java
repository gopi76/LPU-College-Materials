package JavaIOStreams;

import java.io.*;

class StudentDOSE{
    int rollNo;
    String name;
    String dept;
}
public class DataOutputStreamExample {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/srava/Documents/MyJava/Student2.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            
            StudentDOSE s = new StudentDOSE();
            s.rollNo = 10;
            s.name = "John";
            s.dept = "CSE";
            
            dos.writeInt(s.rollNo);
            dos.writeUTF(s.name);
            dos.writeUTF(s.dept);
            
            dos.close();
            fos.close();
            
        }catch(Exception e){
            System.out.println(e);
        }   
    }
}
