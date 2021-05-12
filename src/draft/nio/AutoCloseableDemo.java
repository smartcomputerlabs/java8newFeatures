package nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AutoCloseableDemo implements AutoCloseable{
    String header = null;
    public void open(){
        header = "OPENED";
        System.out.println("Device Opened");
    }
    public String read() throws IOException{
        throw new IOException("Unknown");
    }
    
    public void writeHeader(String str) throws IOException{
        System.out.println("Writing : "+str);
        header = str;
    }
    
    @Override
    public void close(){
        header = null;
        System.out.println("Device closed");
    }
    
    public static void testDevice(){
        try(AutoCloseableDemo d = new AutoCloseableDemo()){
            d.open();
            d.read();
            d.writeHeader("TEST");
            d.close();
        }catch(IOException e){
            System.out.println("Got Exception");
        }
    }
    public static void main(String[] args) {
        //AutoCloseableDemo.testDevice();
        
    	Path p1 = Paths.get("c:\\temp\\test");
    	
        System.out.println(p1.startsWith("c:\\"));
        
        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter( e->{
            ai.incrementAndGet();
            return e.contains("o");
        }).allMatch(x->x.indexOf("o")>0);
                
        System.out.println("AI = "+ai);
        
        List<String> names = Arrays.asList("charles", "chu", "cynthia", "cho", "cici");
        long x = names.stream().filter(name->name.length()>4).collect(Collectors.counting());
        System.out.println(x);
        
    }
    
}