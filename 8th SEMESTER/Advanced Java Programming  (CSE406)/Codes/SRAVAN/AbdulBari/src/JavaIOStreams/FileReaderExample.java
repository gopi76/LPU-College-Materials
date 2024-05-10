
package JavaIOStreams;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:/Users/srava/Documents/MyJava/Test.txt");
            int x;
            while((x=fr.read())!=-1){
                System.out.print((char)x);
            }
        }
//        catch(FileNotFoundException e){
//            System.out.println(e);
//        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
