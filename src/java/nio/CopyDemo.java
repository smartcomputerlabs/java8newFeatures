package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	/* public static void main(String[] args) throws IOException {
         Path p1 = Paths.get("c:\\pathtest\\a.java");
         Path p2 = Paths.get("c:\\pathtest\\dir2\\a.java");
         Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);
         Files.delete(p1);
         System.out.println(p1.toFile().exists()+" "+
                                       p2.toFile().exists());
         
     }*/
	 public static void copy(String records1, String records2) throws IOException {
         try (
                 InputStream is = new FileInputStream(records1);
                 OutputStream os = new FileOutputStream(records2);) {
             byte[] buffer = new byte[1024];
             int bytesRead = 0;
             while ((bytesRead = is.read(buffer)) != -1) {
                 os.write(buffer, 0, bytesRead);
                 System.out.println("Read and written bytes " + bytesRead);
             }
         } catch (IOException | IndexOutOfBoundsException e) {
            // e = new FileNotFoundException();
             e.printStackTrace();
         }
     }

     public static void main(String[] args) throws Exception {
         copy("c:\\pathtest\\a.java", "c:\\pathtest\\dir2\\a.java");
     }
}
