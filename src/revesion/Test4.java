package revesion;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		String s2="";
		char[] ch=s1.toCharArray();
		for(char c: ch)
		{
			if(s2.indexOf(c)==-1)
				s2+=c;
		}
		System.out.println(s2);
	}
}
