package revesion;
import java.util.Scanner;
public class Test5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=scn.nextLine();
		String s1="";
		char[] c=new char[26];
		char j='z';
		for(int i=0; i<c.length; i++)
		{
			c[i]=j;
			j--;
		}
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			s1+=c[ch-97];
		}
		System.out.println(s1);
	}
}
