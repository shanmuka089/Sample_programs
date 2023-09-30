package regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to be martch: ");
		String str=scn.next();
//		in the below line it can matches the first letter a-z & next letter has 0-9.
		Pattern p=Pattern.compile("[a-z][0-9]");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
