package Strings;
import java.util.Scanner;
public class PossibleStrings {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string;");
		String s=scn.nextLine();
		permute(s,0,s.length()-1);

	}
	public static void permute(String s,int start,int end)
	{
		if(start==end)
		{
			System.out.println(s);
			return;
		}
//		in for loop is used to swap the letters for start & i indexes.
		for(int i=start; i<=end; i++)
		{
//		in these start should be set to zero & i value is varying.
			String s1=swap(s,start,i);
//			in these line start don't change(increment or decrement) they only add one with start value & then call recursion.
			permute(s1,start+1,end);
		}	
	}
//	in these method swapping takes place.
	static String swap(String s,int i, int j)
	{
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
//		in these line char[] converts directly into string,one inbuilt method is there it can be done by this method.
		String s1=new String(a);
		return s1;
	}

}
