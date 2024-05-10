package JavaIOStreams;

import java.io.*;


public class FileOutputStreamExample {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/srava/Documents/MyJava/Test.txt");
            String str = "Learn Java Programming";
            
            byte[] b = str.getBytes();
            fos.write(b, 6, str.length()-6);
            
//            for(byte x:b){
//                fos.write(x);
//            }
            
//            fos.write(str.getBytes());
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
