package filterdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterDemo3 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Lithin", null, "Naga", null, "Datta", "Sravan");
        List<String> filteredWords = words.stream().filter(w -> w!=null).collect(Collectors.toList());
        System.out.println(filteredWords);
        System.out.println();
        words.stream().filter(w -> w!=null).forEach(str -> System.out.println(str));
        System.out.println();
        words.stream().filter(w -> w!=null).forEach(System.out::println);
    }
}
