/**
 * 
 */
package stream;

import java.util.stream.Stream;

/**
 * @author navne
 *reduce(<BinaryOperator> accumulator)
 */
public class CollectDemo1 {
public static void main(String[] args) {

System.out.println(Stream.of("Fred","Jim","Sheila").reduce("",(a,b) -> a+b, (a,b) -> a+b));
		//collect("",(a,b) -> a+b, (a,b) -> a+b)); //collect(supplier, accumulator, combiner)
}
}
