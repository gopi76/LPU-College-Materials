import java.util.*; 

// calendar, jsp session, temporal adjusters, move files, change password [jdbc)]

// ca3 

class LocaleDemo {
    public static void main(String[] args) {

        Locale locale1 = new Locale("en");
        Locale locale2 = new Locale("en", "US");
        Locale locale3 = new Locale("en", "US", "POSIX");
        Locale locale4 = Locale.US; 

        System.out.println("Locale 1: " + locale1);
        System.out.println("Locale 2: " + locale2);

        System.out.println("Locale 3: " + locale3);
        System.out.println("Locale 4: " + locale4);

        Locale [] l = Locale.getAvailableLocales();
        for(Locale lc : l)
        	System.out.println(lc.getDisplayName()+"\t"+lc.getCountry()+"\t"+ lc.getLanguage());

    }
}
