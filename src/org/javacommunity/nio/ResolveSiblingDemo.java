package java8.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveSiblingDemo {

	public static void main(String[] args) {
		Path p1 = Paths.get("H:\\mpgsSupport\\java8\\src\\org.javacommunity.nio\\Test1.txt");
		Path p2 = p1.resolveSibling("Test2.txt");
		System.out.println(p2.toString());

	}

}
