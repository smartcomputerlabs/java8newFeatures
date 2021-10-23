package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RootDemo {

	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\main\\project\\Starter.java");

System.out.println(Paths.get("c:\\main\\project\\Starter.java").getRoot().toString());


	}

}
