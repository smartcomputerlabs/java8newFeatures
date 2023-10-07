package java8.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceStringInFile {
    // put your source file location
    //static String sourceFile ="D:\\projects\\javacommunityui\\src\\public\\js\\single.js";
    static String sourceFile ="./src/main/java/java8/org.javacommunity.nio/Source_Test_File";
    public static void main(String[] args) {
        try {
          //  Files.readAllLines();
            List<String> updatedlines = Files.lines(Paths.get(sourceFile)).map(x ->
                    {
                        if(x.contains("links_foot();//cloud"))
                        {
                            System.out.println("-- Before change -- "+x);
                            x = x.replace("links_foot();//cloud","\"<li class='dropdown-link'><a href='../design/hexagonal-architecture.html' class='a'>Hexagonal Architecture</a></li>\"+\nlinks_foot();//cloud");
                            System.out.println("-- After change -- "+x);
                        }
                        return x;
                    }).collect(Collectors.toList());
            //updatedlines.org.javacommunity.stream().forEach(System.out::println);
            FileWriter fw = new FileWriter(sourceFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String str : updatedlines){
                bw.write(str+"\n");
            }
            bw.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            }
        }
}
