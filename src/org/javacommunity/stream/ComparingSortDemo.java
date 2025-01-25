package org.javacommunity.stream;

import java.util.Arrays;
import java.util.List;

public class ComparingSortDemo {

	public static void main(String[] args) {
		List<Item> l = Arrays.asList(new Item(1, "Screw"), new Item(2, "Nail"), new Item(3, "Bolt"));
		l.stream()
		//.sorted((a, b)->a.getId().compareTo(b.getId()))
		//.sorted(Comparator.comparing(a->a.getName())).map((i)->i.getName())
//		.map((i)->i.getName())

		.map((i)->i.getName()).sorted()
		

.forEach(System.out::print);
		
		List<Integer> names = Arrays.asList(1, 2, 3); //1
		names.forEach(x->x=x+1); //2
		names.forEach(System.out::println); 

	}

}