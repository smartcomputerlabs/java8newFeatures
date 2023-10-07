package java8.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveNormalizeDemo {

	public static void main(String[] args) {
		//Path path1 = Paths.get("C:\\init\\.\\").resolve(Paths.get("appended.txt"));
	/*	Path path1 = Paths.get("init\\.\\").resolve(Paths.get("inputPath\\appended.txt"));
		System.out.println("path1 = "+path1);
		
		Path path2 = new File("c://lizard/././actions/../walking.txt").toPath();
		System.out.println("path2 = "+path2);
		try {
			System.out.println(" "+Files.isSameFile(path1,path2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" "+path1.equals(path2));
		System.out.println(" "+path1.normalize().equals(path2.normalize()));*/
		
		final Path path = Paths.get(".").normalize(); // h1
		System.out.println(path.getName(0));
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		count++;
		}
		System.out.println(count);
	}

}
