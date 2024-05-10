package JavaIOStreams;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("C:/Users/srava/Documents/MyJava/Test.txt");
            String str = "Learn Java Programming by writer";
            fw.write(str, 0, str.length());
            fw.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
