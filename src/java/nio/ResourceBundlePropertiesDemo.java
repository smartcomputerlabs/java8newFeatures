package nio;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlePropertiesDemo {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("test", locale);
		String[] vals =  rb.getStringArray("cancelLabel");
		
		for(String val : vals) {
			System.out.println(val);
		}
		
		Object val1 = rb.getObject("cancelLabel");
		System.out.println(val1);
		String val2 = rb.getString("cancelLabel");
		System.out.println(val2);
	}

}
