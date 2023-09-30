package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test16 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the letters from the given expression 0-9 witha sequence of 6.
		Pattern p=Pattern.compile("\\d{6}");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
