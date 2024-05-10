//Print all the non-duplicate integers of arraylist in sorted order

import java.util.*;
import java.util.stream.*;

class StreamDemo
{
    static public void main(String ...rk)
    {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(5); 	al.add(4); 	al.add(10);
	al.add(3); 	al.add(10); 	al.add(5);

	Stream <Integer> str = al.stream();
	str = str.distinct().sorted();
	str.forEach(	x -> System.out.println(x)	);

	System.out.println(al);


	

    }
}