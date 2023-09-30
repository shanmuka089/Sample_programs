package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test22 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the letters from 0-9 in the given expression with size 5 it returns boolean.
		Pattern p=Pattern.compile("(?=.*[a-z])(?=.*[0-9])(?=.*[@])");
		Matcher m=p.matcher(str);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
