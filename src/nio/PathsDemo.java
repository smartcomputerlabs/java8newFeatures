package java8.nio;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {

	public static void main(String[] args) {
	/*Path path0 = Paths.get("/","home","zoodirector");
		System.out.println(path0);
		
		Path path1 = Paths.get("birds\\egret.txt");
		System.out.println("Path1 is Absolute? "+path1.isAbsolute());
		System.out.println("Absolute Path1: "+path1.toAbsolutePath());
		
		Path path2 = Paths.get("..\\..\\fish.txt");
		Path path3 = Paths.get("..\\birds.txt");
		System.out.println(path2.relativize(path3));*/
	//	System.out.println(path3.relativize(path2));
		
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(relativePath);
		System.out.println(path3.resolve(relativePath));
		System.out.println( Paths.get("E:\\data\\..\\user\\home").normalize());
		
		//Paths.getPath("ocelot.txt");
		FileSystems.getDefault().getPath("puma.txt");
		//new FileSystem().getPath("leopard");
		//new Path("jaguar.txt");
		FileSystems.getDefault().getPath("puma.txt");
		try {
			Paths.get(new URI("cheetah.txt"));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Paths.get("cats","lynx.txt");
		new java.io.File("tiger.txt").toPath();
	}

}
