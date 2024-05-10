package streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Demo1 {
    public static void main(String[] args){
        List<Integer> numbersList = Arrays.asList(2, 1, 4, 6, 3, 8, 7);
        
        List<Integer> sortedList1 = numbersList.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order: " + sortedList1);
        
        List<Integer> sortedList2 = numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending Order: " + sortedList2);
        
        List<String> stringList = Arrays.asList("sunkara", "lithin", "naga", "datta", "sravan");
        
        List<String> sortedString1 = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order: " + sortedString1);
        
        List<String> sortedString2 = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending Order: " + sortedString2);
    }
    
}
