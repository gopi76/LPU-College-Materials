import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*  Task 2 CSE406  ( April 30, 2024 )

Define a Class Mobile with attributes model name, price, brand. Store atleast 5 mobile objects in an arayList. 

Use StreamAPI  to group all mobile objects based on brand using groupingBY().

Ask the user to enter the brand and display all the mobiles of that particular brand in sorted order based on their price.

*/

class Mobile {
    private String modelName;
    private double price;
    private String brand;

    public Mobile(String modelName, double price, String brand) {
        this.modelName = modelName;
        this.price = price;
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}

public class MobileStore {
    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("iPhone 12", 799.99, "Apple"));
        mobiles.add(new Mobile("Galaxy S21", 899.99, "Samsung"));
        mobiles.add(new Mobile("OnePlus 9", 729.99, "OnePlus"));
        mobiles.add(new Mobile("Pixel 5", 699.99, "Google"));
        mobiles.add(new Mobile("Mi 11", 651.99, "Xiaomi"));
        mobiles.add(new Mobile("iPhone 12", 489.99, "Apple"));
        mobiles.add(new Mobile("iPhone 10", 779.99, "Apple"));
        mobiles.add(new Mobile("iPhone 11", 769.99, "Apple"));
        mobiles.add(new Mobile("iPhone 07", 759.99, "Apple"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the brand to filter mobiles: ");
        String brandFilter = scanner.nextLine();

        Map<String, List<Mobile>> mobilesByBrand = mobiles.stream()
                .collect(Collectors.groupingBy(Mobile::getBrand));

        List<Mobile> filteredMobiles = mobilesByBrand.getOrDefault(brandFilter, new ArrayList<>());

        List<Mobile> sortedMobiles = filteredMobiles.stream()
                .sorted(Comparator.comparingDouble(Mobile::getPrice))
                .collect(Collectors.toList());

        System.out.println("Mobiles of brand " + brandFilter + " sorted by price:");
        sortedMobiles.forEach(mobile -> System.out.println(
                "Model: " + mobile.getModelName() + ", Price: $" + mobile.getPrice()));
    }
}



