package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. 
 * Each mapped stream is closed after its contentshave been placed into this stream. 
 * (If a mapped stream is null an empty stream is used, instead.) 
 * 
 * @author javacommunity.org
 * 
 */
public class FlatMap {

	public static void main(String[] args) {
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
