package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test8 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the letters ab & after c matches has 0 or 1 occurrence.
		Pattern p=Pattern.compile("abc?");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
