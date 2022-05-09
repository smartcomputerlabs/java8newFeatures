package java8.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyAFile {
    static String sourceFile ="./src/main/java/java8/nio/Source_Test_File";
    //D:\projects\javaCode\src\main\java\java8\nio\Source_Test_File
    static String destinationFile ="./src/main/java/java8/nio/Destination_Test_File";

    public static void main(String[] args) {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
            if (Files.exists(Paths.get(sourceFile))) {
                Path p = Files.createFile(Paths.get(destinationFile));
                OutputStream out = Files.newOutputStream(p);
                byte[] buffer = new byte[1024];
                int lengthRead;
                while ((lengthRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lengthRead);
                    out.flush();
                }
            }else{
                System.out.println(" Source File Doesn't Exist");
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            }
        }
}
