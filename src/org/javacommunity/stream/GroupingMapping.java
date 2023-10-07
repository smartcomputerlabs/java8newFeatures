package org.javacommunity.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMapping {

	public static void main(String[] args) {
		List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));

		
		Map<Student.Grade, List<String>> grouping = ls.stream().collect(
			    Collectors.groupingBy(Student::getGrade,
			    Collectors.mapping(Student::getName, Collectors.toList())));
		
		//INSERT CODE HERE
		System.out.println(grouping);
		
		List<String> names = Arrays.asList("Peter", "Paul", "Pascal");
		Optional<String> ops = names.stream().parallel()
		                .filter(name->name.length()>6)
		                .findAny();
		System.out.println(ops);
		

	}

}
class Student {

    public static enum Grade{ A, B , C, D, F}   

    private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	private Grade grade;
    public Student(String name, Grade grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return name+":"+grade;
    }
    //getters and setters not shown
}