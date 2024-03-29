package java8.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFiles {

	 public static void main(String[] args) throws IOException {
         Path p1 = Paths.get("c:\\pathtest\\a.java");
         Path p2 = Paths.get("c:\\pathtest\\dir2\\a.java");
         Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);
         Files.delete(p1);
         System.out.println(p1.toFile().exists()+" "+
                                       p2.toFile().exists());
     }
}
