package localization.dateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DurationDemo {

	public static void main(String[] args) {
	//	Period p = Period.between(LocalDate.now(), LocalDate.of(2019, Month.JANUARY, 20));
	//	 System.out.println(p);
	//	 Duration d = Duration.between(LocalDate.now(), LocalDate.of(2019, Month.JANUARY, 20));
	//	 System.out.println(d);
		 
		 
				 Duration d = Duration.ofDays(1);
				 System.out.println(d);
				 d = Duration.ofMinutes(0);
				 System.out.println(d);        
				 Period p = Period.ofMonths(0);
				 System.out.println(p);
				 
				 LocalDateTime ldt = LocalDateTime.of(2015, Month.APRIL, 1, 12, 00, 00);
				 Duration d1 = Duration.ofHours(24);
				 ldt = ldt.plus(d1); // line n1
				 System.out.println(ldt);
	}
		
}
