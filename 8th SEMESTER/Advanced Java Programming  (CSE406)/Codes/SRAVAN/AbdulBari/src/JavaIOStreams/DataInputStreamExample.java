package JavaIOStreams;

import java.io.*;

class StudentDISE{
    int rollNo;
    String name;
    String dept;
}

public class DataInputStreamExample {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:/Users/srava/Documents/MyJava/Student2.txt");
            DataInputStream dis = new DataInputStream(fis);
            
            StudentDISE s = new StudentDISE();
            s.rollNo = dis.readInt();
            s.name = dis.readUTF();
            s.dept = dis.readUTF();
            
            System.out.println(s.rollNo);
            System.out.println(s.name);
            System.out.println(s.dept);
            
            dis.close();
            fis.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
