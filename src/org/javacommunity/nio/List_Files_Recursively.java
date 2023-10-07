package java8.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class List_Files_Recursively {
	public static String list_files_recursively_from_path = "D:\\projects\\javaCode\\src";//change the path according to your computer

	public static void main(String[] args) {
		Path path = Paths.get(list_files_recursively_from_path);
		ArrayList<String> filesList = new ArrayList<>();
		// change above line to // Set<String> filesChanged = new HashSet<>(); if only unique files' links are needed
		listFileNames(path, filesList);
		filesList.forEach(System.out::println);
	}
	public static void listFileNames(Path path,ArrayList<String> filesList){
		try {
			Stream files = Files.list(path);
			Files.list(path).forEach((p) -> {
				if(Files.isDirectory(p)){
					listFileNames(p.toAbsolutePath(),filesList);
				}else{
					//System.out.println("file : " + p.toAbsolutePath());
					filesList.add(p.toAbsolutePath().toString());
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
