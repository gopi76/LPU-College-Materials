package mapdemos;

import java.util.Arrays;
import java.util.List;


public class MapDemo2 {
    public static void main(String[] args){
        List<String> vehicles = Arrays.asList("Car", "Bike", "Cycle", "Boat", "Plane");
        
        vehicles.stream().map(str -> str.length()).forEach(System.out::println);
        
    }
}
