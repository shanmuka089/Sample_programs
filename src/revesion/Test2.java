package revesion;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=scn.nextLine();
		s=s.toLowerCase();
		for(int i=0; i<s.length()-1; i++)
		{
			for(int j=i+2; j<=s.length(); j++)
			{
				String s2=s.substring(i, j);
				if(isPolindrome(s2))
					System.out.println(s2);
			}
		}
	}
	static boolean isPolindrome(String s)
	{
		char[] a=s.toLowerCase().toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}
