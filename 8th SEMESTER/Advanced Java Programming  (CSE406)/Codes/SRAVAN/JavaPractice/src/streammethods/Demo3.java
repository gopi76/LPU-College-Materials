package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args){
        List<String> letters = Arrays.asList("A", "B", "C", "1", "2", "3");
        
        Optional<String> reducedLetters = letters.stream().reduce((val, combinedVal) -> {
            return val+combinedVal;
        });
        System.out.println(reducedLetters.get());
    }
    
}
