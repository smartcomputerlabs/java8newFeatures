package dateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime ld1 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0);
		 ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		 LocalDateTime ld2 = LocalDateTime.of(2015, Month.MARCH, 8, 1, 0);
		 ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
		 long x = ChronoUnit.HOURS.between(zd1, zd2);
		 System.out.println(x);
		 SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.FRANCE);
		 System.out.println(sdf.format(new Date()));
		 SimpleDateFormat sdf1 = new SimpleDateFormat("zzzz"); 
	     System.out.println(sdf1.format(new Date()));
	     
	     SimpleDateFormat sdf_MMyy = new SimpleDateFormat("MM/yy", Locale.US);
	     System.out.println("date in MM/yy : "+sdf_MMyy.format(new Date()));
	     
	     SimpleDateFormat sdf_MM_YY = new SimpleDateFormat("MM/YY", Locale.US);
	     System.out.println("date in sdf_MM/YY : "+sdf_MM_YY.format(new Date()));
	     
	     System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now()));

	}

}



