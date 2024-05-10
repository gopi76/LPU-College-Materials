package filterdemos;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    int price;
    
    public Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class FilterDemo4 {
    public static void main(String[] args){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Philips x4 trimmer", 2000));
        productList.add(new Product(2, "Philips a2 trimmer", 3000));
        productList.add(new Product(3, "Philips g3 trimmer", 4000));
        productList.add(new Product(4, "Philips i8 trimmer", 7000));
        productList.add(new Product(5, "Philips z1 trimmer", 1000));
        
        productList.stream().filter(p -> p.price > 2000).forEach(p -> System.out.println(p.name +" "+ p.price));
        
        
    }
}
