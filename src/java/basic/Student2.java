package basic;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleFunction;
import java.util.stream.Collectors;

public class Student2 {
    private String name;
    private int marks;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student2(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return name+":"+marks;
    }
    //getters and setters not shown
    public static void main(String[] args) {
    	List<Student2> ls = Arrays.asList(new Student2("S1", 20), new Student2("S3", 30), new Student2("S3", 20) );
    	Map<Integer, List<Student2>> grouping = ls.stream().collect(Collectors.groupingBy(s ->s.getMarks()));
    	System.out.println(grouping);
    	Double x =100d;
    	x=x+100;
    	/*
    	List<Double> dList = Arrays.asList(10.0, 12.0);
    	DoubleFunction df = z->z+10;
    	dList.stream().forEach(df);
    	dList.stream().forEach(d->System.out.println(d));*/
    	
    	 Path p1 = Paths.get("c:\\temp\\test.txt");
    	   Path p2 = Paths.get("report.pdf");
    	   System.out.println(p1.resolve(p2));
	}
}





