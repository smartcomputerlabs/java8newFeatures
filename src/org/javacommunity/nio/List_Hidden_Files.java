package java8.nio;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class List_Hidden_Files {
	public static String hidden_files_path = ".";

	public static void main(String[] args) {
		
		//before Java8
		File[] hiddenFilesUsingJava7 = new File(hidden_files_path).listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		for(File temp : hiddenFilesUsingJava7){
			System.out.println(".. file .."+temp.getAbsolutePath());
		}

		// Using Java8
		System.out.println("....................... Using java 8 ...............................");
		File[] hiddenFilesUsingJava8 = new File(hidden_files_path).listFiles(File::isHidden);
		//Arrays.org.javacommunity.stream(hiddenFilesUsingJava8).peek(System.out::println);
		Arrays.stream(hiddenFilesUsingJava8).forEach(p -> {System.out.println(".. file .."+p.getAbsolutePath());});
	}

}
