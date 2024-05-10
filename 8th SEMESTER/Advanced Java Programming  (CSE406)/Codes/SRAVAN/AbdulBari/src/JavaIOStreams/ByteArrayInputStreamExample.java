package JavaIOStreams;

import java.io.*;

public class ByteArrayInputStreamExample {
    public static void main(String[] args){
        byte[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        try{
            ByteArrayInputStream bis = new ByteArrayInputStream(b);
//        int x;
//        while((x=bis.read())!=-1){
//            System.out.print((char)x);
//        }   
            String str = new String(bis.readAllBytes());
            System.out.println(str);
            System.out.println(bis.markSupported());//it supports because it's an array and we can read data from an array multiple times
            bis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
