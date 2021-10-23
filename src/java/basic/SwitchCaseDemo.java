package basic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");

   //    Stream.of(l1, l2).flatMap((x)->x.stream()).forEach((x)->System.out.println(x));
  //      Stream.of(l1, l2).flatMap((x)->Stream.of(x)).forEach((x)->System.out.println(x));
       
       List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
       System.out.println("reduce -"+ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
       System.out.println(ls.stream().max(Integer::max).get()); //2
       System.out.println(ls.stream().max(Integer::compare).get()); //3
       System.out.println("max((a, b ="+ls.stream().max((a, b)->a>b?a:b)); 
		
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Set<String> names = new TreeSet<String>();
        names.add("111");names.add("222");
        names.add("111");names.add("333");
        for(String name :  names){
            switch(name){
                default : System.out.print("333 ");  
                    break;
                case "111" : System.out.print("111 ");
                case "222" : System.out.print("222 ");
            }
				String str = "TWO"; 
				switch(str) 
				{ 
					case "one": 
						System.out.println("one"); 
						break; 
					case "two": 
						System.out.println("two"); 
						break; 
					case "three": 
						System.out.println("three"); 
						break; 
					default: 
						System.out.println("no match"); 
				} 
				
			//	public int m3(String a, int b){
				String a = "YES";
				final String XXXX = "hi";
			        switch(a){

			            case  XXXX  : System.out.println("no match"); 

			        }
			//        return 0;
		//	}
	}
        }

}
