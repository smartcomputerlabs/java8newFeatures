package java8.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExceptions {

	public static void main(String[] args) {
		Path file = Paths.get("file.txt");
		Charset chars = Charset.defaultCharset();
		try(BufferedReader br = Files.newBufferedReader(file,chars)){
			/*String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}*/
		} catch (IOException e) {
		//	e.printStackTrace();
		}
		
		try(FileReader filerdr = new FileReader("file.txt")){
			/*String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}*/
		} catch (IOException e) {
		//	e.printStackTrace();
		}
	
	Path path = Paths.get("/home/kaplan/documents/805*.txt");
	/*String line = "";
	while((line = br.readLine()) != null) {
		System.out.println(line);
	}*/
}
	
	

}
