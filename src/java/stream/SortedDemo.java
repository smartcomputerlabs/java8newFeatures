package stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {

		Stream.of("abc","bcd").sorted(String::compareTo).forEach(System.out::println);
		System.out.println(
				IntStream.iterate(0, (n)->n+1) // line n1
				.limit(2)
				.max() // line n2
				);

		Stream.of(new Student1("Sheila", 3.8F), new Student1("Fred", 3.9F)).sorted() // line n1
				.forEach(System.out::println);
		

			String measures[] = {" 1.2E2 ", " 3.14 ", " 3.9E-3 "};
			List<?> numList = Arrays.asList(measures);
			for (int i =0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + " " );
			}
			
			DoubleStream is = DoubleStream.of(0, 2, 4); //1
			double sum = is.filter( i->i%2 != 0 ).sum(); //2
			System.out.println(sum);

	}

}

class Student1 implements Comparable<Student1> {
	public String name;
	public float grade;

	public Student1(String name, float grade) {
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		return "Student1{" + name + ", " + grade + " }";
	}

	@Override
	public int compareTo(Student1 o) {
		return this.name.compareTo(o.name);
	}
}
