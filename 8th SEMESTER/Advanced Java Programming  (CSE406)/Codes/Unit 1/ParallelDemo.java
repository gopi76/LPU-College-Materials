import java.util.*;                      // all libraries will come except sub-libraries.
import java.util.stream.*;

// Date : 25 jan, 2024 (2 to 4pm class)

class ParallelDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		Stream<Integer> str = al.parallelStream();
		if(str.isParallel()) System.out.println("Parallel Stream");

		int result = str.reduce(0, (a, b) -> (b+b)+(a*a), (a, b) -> a+b);
		System.out.println(result);
	}
}