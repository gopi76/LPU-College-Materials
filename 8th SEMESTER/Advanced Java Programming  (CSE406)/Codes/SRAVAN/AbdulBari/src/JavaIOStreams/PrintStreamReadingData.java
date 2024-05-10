package JavaIOStreams;
import java.io.*;

class StudentPSRD{
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamReadingData {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:/Users/srava/Documents/MyJava/Student1.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            
            StudentPSRD s = new StudentPSRD();
            s.rollNo = Integer.parseInt(br.readLine());
            s.name = br.readLine();
            s.dept = br.readLine();
            
            System.out.println("Roll No "+s.rollNo);
            System.out.println("Name "+s.name);
            System.out.println("Dept "+s.dept);
            
            fis.close();
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

