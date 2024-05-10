package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("lithin", "naga", "datta", "sravan", "sunkara");
        List<String> transformedNames = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(transformedNames);
        
        System.out.println();
        names.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
        
        System.out.println();
        names.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
    }
}
