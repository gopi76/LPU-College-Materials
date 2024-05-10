package streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo4 {
    public static void main(String[] args){
        List<String> animalList = Arrays.asList("Cat", "Dog", "puppy");
        List<String> birdsList = Arrays.asList("Parrot", "Peacock", "Swift");
        
        Stream<String> stream1 = animalList.stream();
        Stream<String> stream2 = birdsList.stream();
        
        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
