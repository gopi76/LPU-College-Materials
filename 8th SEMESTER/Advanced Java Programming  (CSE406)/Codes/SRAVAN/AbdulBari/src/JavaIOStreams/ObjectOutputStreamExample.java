package JavaIOStreams;

import java.io.*;

class Students implements Serializable{
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;
    
    public Students(){
        
    }
    
    public Students(int r, String n, float a, String d){
        rollNo = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }
    
    public String toString(){
        return "\nStudent Details\n"+
                "\nRoll "+rollNo+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
            
}
public class ObjectOutputStreamExample {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/srava/Documents/MyJava/Student3.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            Students s = new Students(10,"John",89.5f,"CSE");
            oos.writeObject(s);
            
            fos.close();
            oos.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
