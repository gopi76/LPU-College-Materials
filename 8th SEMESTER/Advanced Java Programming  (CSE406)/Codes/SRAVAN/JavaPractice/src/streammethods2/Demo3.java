package streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Demo3 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("sunkara", "lithin", "sravan");
        
        Optional<String> result = names.stream().findAny();
        System.out.println(result.get());
        
        List<String> names2 = Arrays.asList("naga", "lithin", "sravan");
        Optional<String> result2 = names2.stream().findFirst();
        System.out.println(result2.get());
    }
}
