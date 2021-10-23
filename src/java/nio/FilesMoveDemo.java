package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMoveDemo {

	public static void main(String[] args) {
		
		/*try {
			Files.copy(Paths.get("H:\\mpgsSupport\\java8\\src\\nio\\CopyFiles.java"), Paths.get("H:\\mpgsSupport\\java8\\src\\targetDir1"),
					StandardCopyOption.ATOMIC_MOVE,StandardCopyOption.REPLACE_EXISTING,
					LinkOption.NOFOLLOW_LINKS);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		Path path = Paths.get("turkey");
		try {
			if(Files.isSameFile(path,Paths.get("/zoo/turkey"))) // x1
			Files.createDirectory(path.resolve("info"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
