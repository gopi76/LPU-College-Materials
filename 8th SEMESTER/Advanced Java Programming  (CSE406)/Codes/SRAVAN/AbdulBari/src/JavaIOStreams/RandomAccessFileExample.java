package JavaIOStreams;

import java.io.*;

public class RandomAccessFileExample {
    public static void main(String[] args){
        try{
            RandomAccessFile rf = new RandomAccessFile("C:\\Users\\srava\\Documents\\MyJava\\data.txt","rw");
            
            System.out.println((char)rf.read());
            System.out.println((char)rf.read());
            System.out.println((char)rf.read());
            rf.write('d');
            System.out.println((char)rf.read());
            rf.skipBytes(3);
            System.out.println((char)rf.read());
            rf.seek(3);
            System.out.println((char)rf.read());
            System.out.println(rf.getFilePointer());
            rf.seek(rf.getFilePointer()+2);
            System.out.println((char)rf.read());
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
