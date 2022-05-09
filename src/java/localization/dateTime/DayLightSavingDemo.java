package dateTime;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

public class DayLightSavingDemo {

	public static void main(String[] args) {
		ZonedDateTime depart = ZonedDateTime.of(	2016, 9, 30, 22, 0, 0, 0, ZoneId.of("Europe/Paris"));
				ZonedDateTime arrive = ZonedDateTime.of(2016, 10, 1, 1, 30, 0, 0, ZoneId.of("Europe/Sofia"));
				System.out.println(depart);
				System.out.println(arrive);
				
		//		2016-09-30T22:00+02:00[Europe/Paris]
		//		2016-10-01T01:30+03:00[Europe/Sofia]
				
		//		You add the following code fragment to the existing code:
				Duration flightTime = Duration.between(depart, arrive); // line n1
				System.out.println("Flight time is : " + flightTime);
				
				SimpleDateFormat df = new SimpleDateFormat("zzzz", Locale.UK);
				System.out.println(df.format(new Date()));
				SimpleDateFormat df1 = new SimpleDateFormat("zzzz", Locale.US);
				System.out.println(df1.format(new Date()));
				
				Period p = Period.of(2, 23, 400);
				p = p.normalized(); 
				System.out.println(p);

	}

}
