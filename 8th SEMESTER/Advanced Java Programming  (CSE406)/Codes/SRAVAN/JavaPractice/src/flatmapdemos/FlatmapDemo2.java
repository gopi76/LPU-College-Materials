package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FlatmapDemo2 {
    public static void main(String[] args){
        List<String> teamA = Arrays.asList("Lithin", "Naga");
        List<String> teamB = Arrays.asList("Datta", "Sravan");
        List<String> teamC = Arrays.asList("Sunkara", "Datthu");
        
        List<List<String>> finalList = new ArrayList<>();
        finalList.add(teamA);
        finalList.add(teamB);
        finalList.add(teamC);
        
        //without streams
        for(List<String> list: finalList){
            for(String str : list){
                System.out.println(str);
            }
        }
        
        System.out.println();
        
        finalList.stream().flatMap(str -> str.stream()).forEach(System.out::println);
    }
}
