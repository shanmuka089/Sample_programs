package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test21 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the letters special characters,0-9,A-Z,a-z in the given expression with size 6-9 it returns boolean.
		Pattern p=Pattern.compile("(?=.*[~!@#$%^&*_])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{6,9}"); 	//password validate.
		Matcher m=p.matcher(str);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
