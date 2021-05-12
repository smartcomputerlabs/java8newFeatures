package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 4);
		int sum = is.reduce(0,(a, b)->a+b);
		System.out.println(sum);
		System.out.println( IntStream.rangeClosed(1, 4).max());
		
		int weight = (int) Stream.of(1,2,3,4).filter(e -> e>0).mapToDouble(x->x.doubleValue()).sum();
		
		System.out.println(weight);
	}

}
