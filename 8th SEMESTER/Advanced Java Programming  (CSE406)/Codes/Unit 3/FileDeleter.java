import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleter {

    public static void main(String[] args) {
        Path filePath = Paths.get("C://Users//Dell//Desktop//source1.txt");
       
       // Path directoryPath = Paths.get("/path/to/your/directory");

        try {
            // Delete a file
            Files.deleteIfExists(filePath);
            System.out.println("File deleted successfully.");

            // Delete a directory (must be empty)
           // Files.deleteIfExists(directoryPath);
            //System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            System.err.println("Failed to delete file or directory: " + e.getMessage());
        }
    }
}
