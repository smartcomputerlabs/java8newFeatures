package org.javacommunity.collections;

import java.util.Arrays;
import java.util.List;

public class GenericExtendsDemo {

	public static void main(String[] args) {
	//	public static void printNumbers() {
			 Double numbers[] = {1.2, 3d, 3.9E14};
			 //insert code here
			 //List<? extends Number> numList = Arrays.asList(numbers);
			 List<? super Number> numList = Arrays.asList(numbers);
		//	 List<Number> numList = Arrays.asList(numbers);
		/*
		 * for (Number element : numList) { System.out.println(element); }
		 */
		//	 }
	}

}
