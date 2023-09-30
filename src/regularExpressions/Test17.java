package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test17 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the letters from the given expression except 0-9 with a sequence of 5.
		Pattern p=Pattern.compile("\\D{5}");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}
}
