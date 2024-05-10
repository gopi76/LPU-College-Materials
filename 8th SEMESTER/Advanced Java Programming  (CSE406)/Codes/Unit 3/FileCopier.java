import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopier {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("C://Users//Dell//Desktop//source1.txt");
        Path targetPath = Paths.get("C://Users//Dell//Desktop//source4.txt");

        //Path sourceDirectory = Paths.get("/path/to/your/sourceDirectory");
        //Path targetDirectory = Paths.get("/path/to/your/targetDirectory");

        try {
            
            Files.copy(sourcePath, targetPath);
            System.out.println("File copied successfully.");

            // Copy a directory and its contents recursively
            //Files.copy(sourceDirectory, targetDirectory, StandardCopyOption.REPLACE_EXISTING,
              //         StandardCopyOption.COPY_ATTRIBUTES);
            //System.out.println("Directory copied successfully.");
        } catch (IOException e) {
            System.err.println("Failed to copy file or directory: " + e.getMessage());
        }
    }
}
