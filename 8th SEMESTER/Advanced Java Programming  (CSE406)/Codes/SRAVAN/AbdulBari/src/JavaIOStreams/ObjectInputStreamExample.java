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
public class ObjectInputStreamExample {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:/Users/srava/Documents/MyJava/Student3.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Students s = (Students)ois.readObject();
            
            System.out.println(s);
            
            
            fis.close();
            ois.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
