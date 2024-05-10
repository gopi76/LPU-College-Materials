package JavaIOStreams;

import java.io.*;

public class StudentChallenge1Sol {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:/Users/srava/Documents/MyJava/Source1sol.txt");
            FileOutputStream fos = new FileOutputStream("C:/Users/srava/Documents/MyJava/Source2sol.txt");
            
            int b;
            while((b=fis.read())!=-1){
                if(b>=65 && b<=90){
                    fos.write(b+32);
                }else{
                    fos.write(b);
                }
            }
            
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
