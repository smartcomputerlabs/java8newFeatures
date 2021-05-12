package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxDemo {

	public static void main(String[] args) {
		//System.out.println(Stream.iterate(0, (n)->n+1).limit(2).max());
				/*System.out.println(IntStream.iterate(0, (n)->n+1).limit(2).max());
				System.out.println(LongStream.iterate(0, (n)->n+1).limit(2).max());
				System.out.println(DoubleStream.iterate(0, (n)->n+1).limit(2).max());
				
				long l = IntStream.iterate(0, (n)->n+1).limit(2).count();
				System.out.println(l);
				double d = 100;
				int i = (int) d;
				
				List<String> list = Arrays.asList("3", "6", "8", "14", "15"); 
				
				int x = list.stream().mapToInt(num -> Integer.parseInt(num)) 
                .filter(num -> num % 3 == 0).sum();
				System.out.println(x);*/
				
		//System.out.println(Stream.of("abc","bcd").max(String::compareTo));
		
				//System.out.println(Stream.of("Fred", "Jim", "Sheila").reduce((a,b)->a + " " + b));
				//Stream.of("Fred", "Jim", "Sheila").reduce((a,b)->a + " " + b)						.ifPresent(System.out::println);
			//			System.out.println(Stream.of("Fred", "Jim", "Sheila").collect("", (a,b)-> a=a+b, (a,b)-> a=a+b));
			//			System.out.println(Stream.of("Fred", "Jim", "Sheila").reduce(" ", (a,b)->a+b));
						
						System.out.println(Stream.of("Fred", "Jim", "Sheila")

								.collect(String::new, String::concat, String::concat));
						
						Stream<List<String>> s1 = Stream.of(
				                Arrays.asList("a", "b"),
				                Arrays.asList("a", "c")
				        );

				    Stream<String> news = s1.filter(s->s.contains("c"))
				            .flatMap(olds -> olds.stream());
				    news.forEach(System.out::print);
				    
				    String s = "sss";
				    Object j = s;
				    
				    Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
				    Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); //2
				    System.out.println(obj);
	}

}
