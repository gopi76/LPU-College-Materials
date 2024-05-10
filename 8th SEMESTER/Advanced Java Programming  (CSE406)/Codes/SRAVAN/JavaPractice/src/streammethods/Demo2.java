package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        //COUNT
        long evenNumbers = numbers.stream().filter(x -> x%2 == 0).count();
        System.out.println(evenNumbers);    
        
        //MIN
        Optional<Integer> minVal = numbers.stream().min((val1, val2) ->{
//            return val1.compareTo(val2);
            return val1*val2;
        });
        System.out.println(minVal.get());
        
        //MAX
        Optional<Integer> maxVal = numbers.stream().max((val1, val2) ->{
//            return val1.compareTo(val2);
            return val1*val2;
        });
        System.out.println(maxVal.get());
    }
}
