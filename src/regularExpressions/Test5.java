package regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it matches the letters from A-Z inside a string. 
		Pattern p=Pattern.compile("[A-Z]");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
