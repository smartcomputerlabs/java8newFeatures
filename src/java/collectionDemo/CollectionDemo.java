package collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Map<String, Integer>> keywordRanking;
		keywordRanking = new ArrayList<Map<String, Integer>>();

		List<List<String>> keywordRanking1;
		keywordRanking1 = new ArrayList<List<String>>();
		
		Stream.of(new Student1("Sheila", 3.8F), new Student1("Fred", 3.9F))
		.sorted() // line n1
		.forEach(System.out::println);
	}

}

class Student1 {
	public String name;
	public float grade;

public Student1(String name, float grade) {
this.name = name; this.grade = grade;
}

	public String toString() {
		return "Student{" + name + ", " + grade + " }";
	}
}