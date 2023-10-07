package org.javacommunity.stream;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class TestClass{

    public static boolean checkList(List list, Predicate<List> p){
       return p.test(list);
    }

	public static void main(String[] args) {
		//       boolean b = checkList(new ArrayList(), al -> al.add("h"));
	//	       System.out.println(b);
		       
		double amount = 123456.789;
        Locale fr = new Locale("fr", "FR");
        NumberFormat formatter = NumberFormat.getInstance(fr);
        String s = formatter.format(amount) ;
        System.out.println(s);
        formatter = NumberFormat.getInstance();
        Number amount2 = 0;
		try {
			amount2 = formatter.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println( amount + " " + amount2 );
	}

}
