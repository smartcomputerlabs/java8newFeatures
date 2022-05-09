package kaplan.primitive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class IntDemo {

	public static void main(String[] args) {
		IntStream is1 = IntStream.range(0, 5); //1
		 OptionalDouble x = is1.average(); //2
		 System.out.println(x); //3
		 Path p = Paths.get("H:\\mpgsSupport\\java8\\src\\kaplan\\primitive\\test.txt");
		 try {
			Files.setAttribute(p, "dos:hidden", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
