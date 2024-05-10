import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "C:/Users/Dell/Desktop/source1.txt";

        try {
            // Create a FileReader object to read the file
            FileReader fr = new FileReader(filePath);

            // Wrap FileReader with BufferedReader for more efficient reading
            BufferedReader br = new BufferedReader(fr);

            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }

            // Close the BufferedReader and FileReader
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
