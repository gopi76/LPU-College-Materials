import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistenceChecker {

    public static void main(String[] args) {
        Path filePath = Paths.get("C://Users//Dell//Desktop//source3.txt");

        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
