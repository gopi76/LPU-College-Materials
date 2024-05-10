package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Demo1 {
    public static void main(String[] args){
        List<String> vehiclesList = Arrays.asList("car", "bike", "cycle", "plane", "rocket", "car", "bike", "cycle");
        System.out.println("Vehicles List: " + vehiclesList);
        
        List<String> distinctVehiclesList = vehiclesList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Vehicles List: " + distinctVehiclesList);
        
        long count = distinctVehiclesList.stream().count();
        System.out.println("Count: " + count);
        
        List<String> limitedVehicles = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles: " + limitedVehicles);
    }
}
