import java.util.*;
import java.util.stream.*;

class StreamDemoReverse {
    public static void main(String ...rk) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);  al.add(4);  al.add(6);
        al.add(7);  al.add(8);  al.add(9);

        Stream<Integer> str = al.stream();
        str = str.distinct().sorted(Comparator.reverseOrder()); // Sort in reverse order
        str.forEach(x -> System.out.println(x));

        Collections.reverse(al); 
        System.out.println(al);
    }
}
