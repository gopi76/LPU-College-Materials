
package JavaIOStreams;

import java.io.*;

public class StudentChallenge1Part2 {
    public static void main(String[] args){
        try{
            FileInputStream fis1 = new FileInputStream("C:/Users/srava/Documents/MyJava/Source1.txt");
            FileInputStream fis2 = new FileInputStream("C:/Users/srava/Documents/MyJava/Source2.txt");
            FileOutputStream fos = new FileOutputStream("C:/Users/srava/Documents/MyJava/Destination.txt");
            
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            
            int b;
            while((b=sis.read())!=-1){
                fos.write(b);
            }
            
            fis1.close();
            fis2.close();
            fos.close();
            sis.close();
                    
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
