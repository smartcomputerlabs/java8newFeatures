package kaplan.time;

import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
	//	Stream.of("Fred","Jim","Sheila").reduce("",(a,b) -> a+b).ifPresent(System.out::println);
			Stream.of("Fred","Jim","Sheila").reduce((a,b) -> a + " " +b).ifPresent(System.out::println);
			//System.out.println(Stream.of("Fred","Jim","Sheila").collect("",(a,b) -> a +b, (a,b) -> a +b));
			System.out.println(Stream.of("Fred","Jim","Sheila").reduce(" ",(a,b) -> a +b));
			System.out.println(Stream.of("Fred","Jim","Sheila").reduce((a,b) -> a + " " +b));

	}

}
