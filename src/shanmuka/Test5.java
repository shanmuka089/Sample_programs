package shanmuka;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number;");
		int n=scn.nextInt();
		int a=0,b=1,c;
		for(int i=0; i<=n; i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		m1();
	}
	public static void m1()
	{
		int a=10;
		int b=30;
		int num=a>b? a:b;
//		break is used to exit the current running loop.
//		return is used to exit current method.
		while(true)
		{
			if(num%a==0 && num%b==0)
			{
				System.out.println(num);
				break;
			}
			num++;
		}
		m2();
	}
	public static void m2()
	{
		int a=10;
		int b=30;
		int num=a<b? a:b;
		for(int i=num; i>0; i--)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println(i);
				break;
			}
		}
		prime();
	}
	public static void prime()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number to check prime or not;");
		int n=scn.nextInt();
		if(n<=1) {
			System.out.println("it is not a prime.");
			return;
		}
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.println("it is not a prime");
				return;
			}
		}
		System.out.println("its a prime");
		primerange();
	}
	public static void primerange()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the upper limit;");
		int n1=scn.nextInt();
		System.out.println("enter the lower limit;");
		int n2=scn.nextInt();
		while(n1<=n2)
		{
			boolean b=true;
			for(int i=2; i<=n1/2; i++)
			{
				if(n1%i==0) {
					b=false;
					break;
				}
			}
			if(b)
				System.out.println(n1);
			n1++;
		}
		BinToDec();
	}
	public static void BinToDec()
	{
		int n=56;
		int bin=0;
		int i=1;
		while(n>0)
		{
			int b=n%2;
			bin=(b*i)+bin;
			n/=2;
			i*=10;
		}
		System.out.println(bin);
		DecToBin();
	}
	public static void DecToBin()
	{
		int bin=111101;
		int n=0;
		int i=1;
		while(bin>0)
		{
			n+=(bin%10)*i;
			i*=2;
			bin/=10;
		}
		System.out.println(n);
	ReverseNum();
	}
	public static void ReverseNum()
	{
		int n=1234;
		int r=0;
		int i=1;
		while(n>0)
		{
			r=(r*10)+(n%10);
			n/=10;
		}
		System.out.println(r);
		Armstrong();
	}
	public static void Armstrong()
	{
		int n=153;
		int temp=n;
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		System.out.println(count);
		n=temp;
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			int p=1;
			for(int i=1; i<=count; i++)
			{
				p=p*a;
			}
			sum+=p;
			n/=10;
		}
		System.out.println(sum);
		if(sum==temp)
			System.out.println("it is a Armstrong");
		else
			System.out.println("it is not a Armstrong");
		Polindrome();
	}
	public static void Polindrome()
	{
		int n=1221;
		int temp=n;
		int p=0;
		while(n>0)
		{
			p=(p*10)+(n%10);
			n/=10;
		}
		if(p==temp)
			System.out.println("it is polindrome");
		else
			System.out.println("it is not a polindrome");
		AlternativePrime();
	}
	public static void AlternativePrime()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a lower limit");
		int n1=scn.nextInt();
		System.out.println("enter a upper limit");
		int n2=scn .nextInt();
		int count=0;
		boolean flag;
		for(int i=n1; i<=n2; i++)
		{
			if(i<=1)
				continue;
			flag=true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0) {
					flag=false;
					break;
			}
			}
			if(flag)
			{
				count++;
				if(count%2!=0)
					System.out.println(i);
			}
		}
	}
}

