package JavaIOStreams;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:/Users/srava/Documents/MyJava/Test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            bis.mark(10);
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            bis.reset();
            
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            
            fis.close();
            bis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
