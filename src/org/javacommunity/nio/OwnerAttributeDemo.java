package org.javacommunity.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class OwnerAttributeDemo {
	public static void main(String[] args) {
		Path path = Paths.get("c:\\temp\\test.txt");
		PosixFileAttributeView pfav = Files.getFileAttributeView(path, PosixFileAttributeView.class);
		PosixFileAttributes attrs = null;
		try {
			attrs = pfav.readAttributes();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String ownername = attrs.owner().getName();
				
				AclFileAttributeView av = Files.getFileAttributeView(path, AclFileAttributeView.class);
		//AclFileAttributeView attrs = av.readAttributes();
		//String ownername = attrs.getOwner().getName();
	}

}
