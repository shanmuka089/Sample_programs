package shanmuka;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int m=scn.nextInt();
		int n=1;
		for(int i=1; i<=m; i++)
		{
			int k=n+(i-1);
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(k);
					k--;
					n++;
				}
				else
				{
					System.out.print(n);
					n++;
				}
				if(j<i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
