import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {

    public static void main(String[] args) {
        // Set the desired locale
        Locale locale = new Locale("fr", "FR"); // French locale

        // Load resource bundle for the specified locale
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);

        // Access localized messages from the resource bundle
        String greeting = bundle.getString("greeting");
        String farewell = bundle.getString("farewell");

        System.out.println(greeting); // Output: Bonjour!
        System.out.println(farewell); // Output: Au revoir!
    }
}
