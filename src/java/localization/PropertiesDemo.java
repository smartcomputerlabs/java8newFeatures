package localization;

import java.text.DateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesDemo {

	public static void main(String[] args) {
	/*	Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); // L1
		ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);
		Enumeration<String> en = msgs.getKeys();
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			String val = msgs.getString(key);
			System.out.println(key + " : " + val);
		}*/
		
        
		Locale.setDefault(new Locale("fr", "CA")); //Set default to French Canada
        Locale l = new Locale("jp", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("appmessages", l);
        String msg = rb.getString("greetings");
        System.out.println(msg);
        
        Locale l1 = new Locale.Builder().build();
        // Locale l1 = new Locale.Builder(Locale.CHINA); // compile time error
        
         	 DateFormat dFormat;
         	dFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.UK);
        	 String fNow = dFormat.format(new Date());
        	 System.out.println(fNow);
        	 
        	 Duration d = Duration.ofDays(1);
        	 System.out.println(d);
        	 d = Duration.ofMinutes(0);
        	 System.out.println(d);        
        	 Period p = Period.ofMonths(0);
        	 System.out.println(p);
	}

}

class Book {
	private String title;
	private double price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	// getters/setters not shown
}