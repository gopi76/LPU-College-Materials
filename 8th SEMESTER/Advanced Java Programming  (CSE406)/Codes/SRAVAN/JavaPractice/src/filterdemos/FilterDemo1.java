package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterDemo1 {
    public static void main(String[] args){
//        ArrayList<Integer> numberList = new ArrayList<>();
//        numberList.add(10);
//        numberList.add(20);
//        numberList.add(30);
//        numberList.add(40);
//        numberList.add(50);
//        System.out.println(numberList);

        List <Integer> numberList = Arrays.asList(10, 15, 20, 30, 40, 50);
//        System.out.println("Normal List: "+numberList);
        
        ArrayList <Integer> evenNumberList;
        
        //Without Streams
//        for(int n: numberList){
//            if(n%2==0){
//                evenNumberList.add(n);
//            }
//        }
//        System.out.println("Even Numbers: "+evenNumberList);

        //With Streams
        evenNumberList = (ArrayList<Integer>) numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);
        
        numberList.stream().filter(n->n%2==0).forEach(n -> System.out.println(n));
//        numberList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
    
}
