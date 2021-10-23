package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMethods {

	public static void main(String[] args) {
		/*System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());*/
		
		// Zone id -
		ZoneId.getAvailableZoneIds().stream()
		.filter(z -> z.contains("Asia") && z.contains("S")).sorted().forEach(System.out::println);
		
		LocalDate date = LocalDate.of(2019, Month.JANUARY, 10);
		date.plusDays(10);  // ignored as date is immutable
		System.out.println(date);
		

	}

}
