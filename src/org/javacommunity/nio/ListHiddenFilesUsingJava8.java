package org.javacommunity.nio;

import java.io.File;
import java.io.FileFilter;

public class ListHiddenFilesUsingJava8 {

	public static void main(String[] args) {
		
		//before Java8
		File[] hiddenFilesUsingJava7 = new File(".").listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		
		// Using Java8
		File[] hiddenFilesUsingJava8 = new File(".").listFiles(File::isHidden);
		System.out.println(hiddenFilesUsingJava8.toString());
	}

}
