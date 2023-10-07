package java8OReally.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8OReally.Artist;

public class Q1 {

	public static void main(String[] args) {
		Arrays.stream(new int[] {1,2,3});
		Q1.addUp(Arrays.stream(new Integer[] {1,2,3}));
	}
	
	// a. A function that adds up numbers, i.e., int addUp(Stream<Integer> numbers)
	static int addUp(Stream<Integer> numbers) {
		//numbers.collect(to)
		int total=0;
		numbers.forEach(number -> {
				//total = total+number;
			});
		return 0;		
	}
	//b. A function that takes in artists and returns a list of strings with their names and places of origin
	static List<String> namesList(Stream<Artist> artists) {
		return artists.map(artist -> artist.getName()).collect(Collectors.toList());		
	}
	//c. A function that takes in albums and returns a list of albums with at most three	tracks

}
