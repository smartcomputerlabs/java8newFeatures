package org.javacommunity.lambdas;

import java.util.stream.Stream;

public class StaticRefDemo {

	private String value;

	public StaticRefDemo(String t) {
		this.value = t;
	}

	public String doIt(String v) {
		return "" + v.charAt(0) + value.charAt(0);
	}

	public void doIt1(String v) {
		System.out.println("");
	}
	
	public static void main(String[] args) {
		StaticRefDemo t = new StaticRefDemo("ABCD");
		Stream.of("P", "Q").map(t::doIt).forEach(System.out::println);
		//Stream.of("P", "Q").forEach(StaticRefDemo::doIt1);//compile time error Non-static method cannot be referenced from a static context
	}

}
