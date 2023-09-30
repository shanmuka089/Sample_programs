package regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the letter between 0-9.
		Pattern p=Pattern.compile("[0-9]");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}
}
