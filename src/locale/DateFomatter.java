package locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFomatter {
	
	static void printDate(Locale locale){  
//		we can use date format has default,shor & long
		DateFormat formatter=DateFormat.getDateInstance(DateFormat.SHORT,locale); 
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayCountry());		
		Date currentDate=new Date();  
		String date=formatter.format(currentDate);  
		System.out.println(date+" "+locale);  
		}  
		  
		public static void main(String[] args) {  
		    printDate(Locale.UK);  
		    printDate(Locale.US);  
		    printDate(Locale.FRANCE);  
		    printDate(Locale.GERMAN);  
		}  
}
