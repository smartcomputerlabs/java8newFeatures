package org.javacommunity.lambdas;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String s1= new String("str1");
		String s2 = null;
		System.out.println("ofNullable(s) val = "+Optional.ofNullable(s1));
		System.out.println("ofNullable(null) val = "+Optional.ofNullable(null));
		//System.out.println(Optional.of(null));// //java.lang.NullPointerException
		
	//	Optional.of(null);     //java.lang.NullPointerException 
		Optional.empty().ifPresent(System.out::println);  // no exception but no output
		Optional.ofNullable(s1).ifPresent(System.out::println);
		String result = Optional.ofNullable(s2).orElseGet(()->{
			System.out.println("No");
			return "Empty String";
		});
		System.out.println("Final String Result: "+result);
	//	Optional.empty().get();   // java.util.NoSuchElementException: No value present

	}

}
