package dateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*LocalDateTime dateTime = LocalDateTime.of(2019, Month.JANUARY, 18,12,12);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
		f.format(dateTime);
	//	f.format(date);
	//	f.format(time);
		System.out.println(dateTime);
		
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM d, yyyy, h:m");
        System.out.println(dateTime.format(f1));
        
        LocalDateTime d2 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p2 = Period.of(1, 2, 3);
        d2 = d2.minus(p2);
        DateTimeFormatter ft_Short2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("d2 = "+ft_Short2.format(d2));
        
      
        
   //     LocalDate date4 = LocalDate.of(2018, Month.APRIL, 31);
  //      System.out.println(date4.getYear() + " " + date4.getMonth() + " "+ date4.getDayOfMonth());
        
        LocalDate date5 = LocalDate.of(2018, Month.JANUARY, 31);
        date5.plusDays(2);
        date5.plusYears(3);
        System.out.println(date5.getYear() + " " + date5.getMonth() + " "+ date5.getDayOfMonth());*/
		  LocalDateTime d3 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
	        Period p3 = Period.ofDays(1).ofYears(2);
	        d3 = d3.minus(p3);
	        DateTimeFormatter fdt_Short3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	        System.out.println("d3 = "+d3.format(fdt_Short3));
        
        LocalDateTime dt = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofYears(2).ofDays(1);
        dt = dt.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(dt));
        
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        String m2 = Duration.ofMinutes(1).toString();
        String s = Duration.of(69, ChronoUnit.SECONDS).toString();
        String d = Duration.ofDays(1).toString();
        String p1 = Period.ofDays(1).toString();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(s);
        System.out.println(m1.equals(s));

	}

}
