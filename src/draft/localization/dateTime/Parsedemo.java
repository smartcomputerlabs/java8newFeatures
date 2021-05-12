package localization.dateTime;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.DoubleStream;

public class Parsedemo {

	public static void main(String[] args) {
	         double amount = 123456.789;
	         Locale fr = new Locale("fr", "FR");
	         NumberFormat formatter = NumberFormat.getInstance(fr);
	         String s = formatter.format(amount) ;
	         System.out.println( s );
	         formatter = NumberFormat.getInstance();
	         Number amount2=0;
			try {
				amount2 = formatter.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         System.out.println( amount + " " + amount2 );
	         
	         DoubleStream is = DoubleStream.of(0, 2, 4); //1
	         double sum = is.filter( i->i%2 != 0 ).sum(); //2
	         System.out.println(sum); //3

	}

}
