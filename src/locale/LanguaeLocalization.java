package locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguaeLocalization {
	
	public static void main(String[] args) {
		
		
		String lan="ge";
		String coun="GE";
		Locale locale1=new Locale(lan,coun);
		ResourceBundle rb=ResourceBundle.getBundle("locale/myLocale",locale1);
		String x=rb.getString("hello");
		System.out.println(x);
	}

}
