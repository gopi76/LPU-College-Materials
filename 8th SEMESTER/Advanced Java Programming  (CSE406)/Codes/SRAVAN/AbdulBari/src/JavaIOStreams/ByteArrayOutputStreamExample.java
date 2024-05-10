package JavaIOStreams;

import java.io.*;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream(10);
            bos.write('a');
            bos.write('b');
            bos.write('c');
            
            byte[] b = bos.toByteArray();
            for(byte x:b){
                System.out.println((char)x);
            }
            
            bos.writeTo(new FileOutputStream("C:/Users/srava/Documents/MyJava/TestEx.txt"));
            
            bos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
