package streammethods2;

import java.util.HashSet;
import java.util.Set;


public class Demo2 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        
        set.add("sunkara");
        set.add("lithin");
        set.add("naga");
        set.add("datta");
        set.add("sravan");
        
        //any match
        boolean result = set.stream().anyMatch(val -> {
            return val.startsWith("s");
        });
        System.out.println(result);
        
        //all match
        result = set.stream().allMatch(val -> {
            return val.startsWith("s");
        });
        System.out.println(result);
        
        //none match
        result = set.stream().noneMatch(val -> {
            return val.startsWith("h");
        });
        System.out.println(result);
    }
}
