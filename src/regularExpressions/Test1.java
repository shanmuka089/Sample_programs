package regularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a expreession to be match: ");
		String str=scn.next();
//		'.'is used to match any character in a string.
		Pattern p=Pattern.compile(".");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}
}
