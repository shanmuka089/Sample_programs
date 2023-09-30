package shanmuka;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=scn.nextInt();
		}
		int sum=0;
//		------------------------------------------------------------------------
		for(int j=0; j<n-1; j++)
		{
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		sum=a[0]+a[1];
//		--------------------------------------------------------------------------
		System.out.println(sum);
	}

}
