import java.util.*;
import java.util.stream.*;

class CollectorDemo {
    public static void main(String... rk) {
        ArrayList<Mobile> al = new ArrayList<>();
        al.add(new Mobile("Redme 8", 8, "Android"));
        al.add(new Mobile("Nokia N2", 16, "Windows"));
        al.add(new Mobile("Realme 5i", 8, "Android"));
        al.add(new Mobile("I Phone 14", 8, "iOS"));
        al.add(new Mobile("I Phone 13", 4, "iOS"));

        // Partitioning by OS (Android vs. non-Android)
        Map<Boolean, List<Mobile>> mp = al.stream()
            .sorted((m1, m2) -> m2.ram.compareTo(m1.ram))
            .collect(Collectors.partitioningBy(a -> a.OS.equals("Android")));

        // Grouping by OS
        Map<String, List<Mobile>> mp1 = al.stream()
            .sorted((m1, m2) -> m2.ram.compareTo(m1.ram))
            .collect(Collectors.groupingBy(x -> x.OS));

        // Printing partitioned map (Android vs. non-Android)
        System.out.println("Partitioned Map (Android vs. non-Android):");
        mp.forEach((isAndroid, mobileList) -> {
            System.out.println(isAndroid ? "Android:" : "Non-Android:");
            mobileList.forEach(mobile -> {
                System.out.println("\t" + mobile.model + "\t" + mobile.ram + "\t" + mobile.OS);
            });
        });

        System.out.println(); // Adding a blank line for separation

        // Printing list of non-Android (iOS) mobiles
        List<Mobile> iosMobiles = mp1.get("iOS");
        if (iosMobiles != null) {
            System.out.println("Non-Android (iOS) Mobiles:");
            iosMobiles.forEach(mobile -> {
                System.out.println("\t" + mobile.model + "\t" + mobile.ram + "\t" + mobile.OS);
            });
        }
    }
}

class Mobile {
    Integer ram;
    String OS, model;

    Mobile(String mod, int ram, String os) {
        model = mod;    
        this.ram = ram;     
        OS = os;
    }
}
