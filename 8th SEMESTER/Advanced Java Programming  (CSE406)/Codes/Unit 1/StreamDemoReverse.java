import java.util.*;
import java.util.stream.*;

class StreamDemoReverse {
    public static void main(String ...rk) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);  al.add(4);  al.add(6);
        al.add(7);  al.add(8);  al.add(9);

        Stream<Integer> str1 = al.stream();
        Stream<Integer> str2 = al.stream();
        str1 = str1.distinct().sorted();
        str2 = str2.distinct().sorted(Comparator.reverseOrder()); 
        // Sort in reverse order
        str1.forEach(x -> System.out.print(x +" "));
        str2.forEach(x -> System.out.println(x +" "));

        Collections.reverse(al); 
        System.out.println(al);
    }
}
