package lambdas;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String s= new String("str");
		System.out.println("ofNullable(s) val = "+Optional.ofNullable(s));
		System.out.println("ofNullable(null) val = "+Optional.ofNullable(null));
		//System.out.println(Optional.of(null));
		
	//	Optional.of(null);     //java.lang.NullPointerException 
		Optional.empty().ifPresent(System.out::println);  // no exception but no output
		Optional.empty().orElseGet(()->{System.out.println("No");return
				false;});
	//	Optional.empty().get();   // java.util.NoSuchElementException: No value present

	}

}
