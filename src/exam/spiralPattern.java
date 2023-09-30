package exam;

import java.util.Scanner;

public class spiralPattern {
public static void main(String[]args)
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a number;");
			int n=scn.nextInt();
			int[][] x=CreateArray(n);
			for(int[] k: x)
			{
				for(int i: k)
				{
					System.out.print(i+"\t");
				}
				System.out.println();
			}
		}
		public static int[][] CreateArray(int n)
		{
			int[][] a=new int[n][n];
			int r=0;
			int c=-1;
			char move='r';
			for(int i=1; i<=n*n; i++)
			{
				switch(move)
				{
					case 'r':
							c++;
							a[r][c]=i;
							if(c==n-1 || a[r][c+1]!=0) move='d';
							break;
					case 'd':
							r++;
							a[r][c]=i;
							if(r==n-1 || a[r+1][c]!=0) move='l';
							break;
					case 'l':
							c--;
							a[r][c]=i;
							if(c==0 || a[r][c-1]!=0) move='t';
							break;
					case 't':
							r--;
							a[r][c]=i;
							if(a[r-1][c]!=0) move='r';
							break;					
				}
			}
			return a;
		}
	}