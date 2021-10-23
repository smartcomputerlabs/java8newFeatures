/**
 * 
 */
package stream;

import java.util.stream.Stream;

/**
 * @author navne
 *reduce(<BinaryOperator> accumulator)
 */
public class CollectDemo {
public static void main(String[] args) {

System.out.println(Stream.of("Fred","Jim","Sheila").reduce(accumulator)
		//collect("",(a,b) -> a+b, (a,b) -> a+b)); //collect(supplier, accumulator, combiner)
}
}
