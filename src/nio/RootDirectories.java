package java8.nio;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RootDirectories {
public static void main(String[] args) {

	 
	File[] roots = File.listRoots();
	 for(File f : roots){
	     System.out.println(f);
	 }
	 
	 Iterable<Path> roots1 = FileSystems.getDefault().getRootDirectories();
	 for(Path p : roots1){
	     System.out.println(p);
	 }
}
}
