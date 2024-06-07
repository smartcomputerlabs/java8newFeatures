package org.javacommunity.localization.dateTime;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateDemo {

	public static void main(String[] args) {
		
	
	        Path p1 = Paths.get("\\temp\\records");
	        Path p2 = p1.resolve("clients.dat");
	        System.out.println(p2+" "+(p2.startsWith("\\") && p2.endsWith("clients.dat")));
	        

	    
		LocalDate day = LocalDate.of(2016, Month.JULY, 20);
		//day = day.plusHours(24);
		System.out.println(day);
		
		System.out.println(LocalDate.of(2016, 8, 25)); // 1
		System.out.println(LocalDate.of(2016, Month.APRIL, 20)); // 2
		// LocalDate date = new LocalDate(); // 3
		System.out.println(LocalDate.now()); // 4

		// LocalDate ld = LocalDate.of(2015, Month.APRIL, 41); // Exception in thread
		// "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid
		// values 1 - 28/31): 41
		LocalDate ld = LocalDate.of(2015, Month.APRIL, 21);
		// Duration d = Duration.ofHours(24);
		// ld = ld.plus(d); // line n1
		System.out.println(ld);

		System.out.println(Duration.ofMillis(1100));
		System.out.println(Duration.ofSeconds(61));

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); // 1
		Stream<Integer> primeStream = primes.stream();
		Predicate<Integer> test1 = k -> k < 10;
		primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting())).values()
				.forEach(System.out::print);

		java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
		System.out.println(dt);

		/*
		 * Period p = Period.between(LocalDate.now(), LocalDate.of(2019, Month.FEBRUARY,
		 * 8)); // B-A System.out.println(p); Duration d =
		 * Duration.between(LocalDate.now(), LocalDate.of(2019, Month.FEBRUARY, 8));
		 * System.out.println(d);
		 */

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 1);
		map1.put("c", null);
		map1.merge("b", 5, (i1, i2) -> i1 + i2);
		map1.merge("c", 9, (i1, i2) -> i1 + i2);
		map1.merge("d", 9, (i1, i2) -> i1 + i2);
		System.out.println(map1);
	}

}
