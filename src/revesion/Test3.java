package revesion;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string:");
		String s1=scn.nextLine();
		char[] c=s1.toCharArray();
		int i=c.length-1; 
		int j=i;
		String s2="";
		while(i>=0)
		{
			while(i>=0 && c[i]!=' ')
			{
				i--;
			}
			int k=i+1;
			String temp="";
			while(k<=j)
			{
				temp+=c[k];
				k++;
			}
			s2+=temp;
			if(i>=0)
				s2+=" ";
			i--;
			j=i;
		}
		System.out.println(s2);
	}
}
