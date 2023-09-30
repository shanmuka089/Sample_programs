package shanmuka;
import java.util.*;
public class Berger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("get the number of teams");
		int num=scn.nextInt();
		int [][] arr=new int[num][4];
		int [] a=new int[num];
		int sum=0;
		for(int i=0; i<num; i++)
		{
			System.out.println("time taken for team"+(i+1));
			for(int j=0; j<4; j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		System.out.println("input total berger per team");
		int burg=scn.nextInt();
		System.out.println("input the competition duration");
		int duration=scn.nextInt();
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<4; j++)
			{
				sum+=duration/arr[i][j];
			}
			a[i]=sum;
			sum=0;
		}
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--)
		{
			if(a[i]<=burg)
			{
				System.out.println("team "+i+" with "+a[i]+" complete berger");
				break;
			}
		}
		

	}

}
