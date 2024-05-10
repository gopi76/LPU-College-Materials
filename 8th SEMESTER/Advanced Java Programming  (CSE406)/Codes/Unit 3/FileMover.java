import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMover {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("C://Users//Dell//Desktop//source4.txt");
        Path targetPath = Paths.get("C://Users//Dell//Desktop//8th Semester//target.txt");
        //Path sourceDirectory = Paths.get("/path/to/your/sourceDirectory");
        //Path targetDirectory = Paths.get("/path/to/your/targetDirectory");

        try {
            // Move (rename) a file
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved (renamed) successfully.");

            // Move (rename) a directory
            //Files.move(sourceDirectory, targetDirectory, StandardCopyOption.REPLACE_EXISTING);
            //System.out.println("Directory moved (renamed) successfully.");
            
        } catch (IOException e) {
            System.err.println("Failed to move (rename) file or directory: " + e.getMessage());
        }
    }
}
