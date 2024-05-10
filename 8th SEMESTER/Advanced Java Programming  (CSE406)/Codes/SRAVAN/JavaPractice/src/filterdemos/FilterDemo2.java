package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Sravan", "Kalyan", "Charan", "Boss");
        List<String> filterNames;
        
        filterNames = names.stream().filter(str -> str.length() > 5).collect(Collectors.toList());
        System.out.println(filterNames);
        
//        names.stream().filter(str -> str.length() > 5).forEach(str -> System.out.println(str));
        
        names.stream().filter(str -> str.length() > 5).forEach(System.out::println);
    }
}
