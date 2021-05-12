package stream;

import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		Stream.generate(()->{System.out.println("."); return 0;}).count();

	}

}
