package exam;
public class exam {

	public static void main(String[] args)
	{
		int[] a={2,5,6,7,4,3};
		int[] b=sort(a);
		int c=check(b);
		System.out.println(c);
	}
	public static int[] sort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static int check(int[] a)
	{
		int k=0;
		for(int i=0; i<a.length-1; i++)
		{
				if(a[i]+1==a[i+1])
					k=1;
				else 
				{
					k=0;
					return k;
				}
		}
		return k;	
	}
}
