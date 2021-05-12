package java8newFeatures.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Average {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	public Average(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getters/setters not shown
	public static void main(String[] args) {
		List<Average> friends = Arrays.asList(new Average("Bob", 31), new Average("Paul", 32), new Average("John", 33));
	//	double averageAge = friends.stream().filter(f -> f.getAge() < 30).mapToInt(f -> f.getAge()).average()
		//		.orElse(0.0);
		
		double averageAge = friends.stream().filter(f->f.getAge()<30)
		        .mapToInt(f->f.getAge())
		        .average().getAsDouble();
		
		System.out.println(averageAge);
		
		List<Integer> ls = Arrays.asList(1, 2, 3);
		 Function<Integer, Integer> func = a->a*a; //1
		 ls.stream().map(func).peek(System.out::print).count();
	}
}
