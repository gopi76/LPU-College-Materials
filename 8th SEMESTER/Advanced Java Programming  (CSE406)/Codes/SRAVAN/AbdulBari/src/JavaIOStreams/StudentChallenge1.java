

import java.io.*;

public class StudentChallenge1 {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:/Users/Dell/Desktop/source1.txt");
                                              //C:\Users\Dell\Desktop
            byte[] b = new byte[fis.available()];
            
            fis.read(b);
            
            String str = new String(b);
            String str2 = str.toLowerCase();
            
            FileOutputStream fos = new FileOutputStream("C:/Users/Dell/Desktop/source2.txt");
            
            byte[] b2 = str2.getBytes();
            fos.write(b2, 0, str2.length());
            fis.close();
            fos.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}
