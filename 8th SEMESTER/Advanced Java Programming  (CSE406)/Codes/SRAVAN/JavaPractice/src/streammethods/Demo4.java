package streammethods;

import java.util.Arrays;
import java.util.List;


public class Demo4 {
    public static void main(String[] args){
        List<String> letters = Arrays.asList("A", "B", "C", "1", "2", "3");
        
        Object[] array = letters.stream().toArray();
        for(Object val: array){
            System.out.println(val);
        }
    }
}
