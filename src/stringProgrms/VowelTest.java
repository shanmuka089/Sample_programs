package stringProgrms;
import java.util.Scanner;
import stringMethods.Vowels;
public class VowelTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String;");
		String s4=sc.next();
		System.out.println(Vowels.Lowercase(s4));
		System.out.println("enter the String;");
		String s3=sc.next();
		System.out.println(Vowels.Reverse(s3));
		System.out.println("enter the String;");
		String s1=sc.next();
		System.out.println(Vowels.Vowels(s1));
		Vowels v=new Vowels();
		System.out.println("enter the String;");
		String s2=sc.next();
		System.out.println(v.Consonants(s2));
		System.out.println("enter two Strings;");
		String s5=sc.next();
		String s6=sc.next();
		System.out.println(v.Conctenate(s5,s6));
		System.out.println("enter two String;");
		String s7=sc.next();
		System.out.println(v.ReverseArray(s7));
	}
}
