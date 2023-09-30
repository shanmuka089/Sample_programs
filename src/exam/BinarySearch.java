package exam;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,6,8,9,4,3,7,2};
		for(int i=0; i<a.length; i++)
		{
			int minindex=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[minindex])minindex=j;	
			}
			if(i!=minindex)
			{
				int temp=a[i];
				a[i]=a[minindex];
				a[minindex]=temp;
			}
		}
		System.out.println(binarySearch(a,7,0,(a.length-1)));
	}
	public static int binarySearch(int[] a,int i,int start,int end)
	{
		if(start>end) return -1;
		int m=(start+end)/2;
		if(i==a[m]) return m;
		else if(i<a[m])
		return binarySearch(a,i,start,m-1);
		else 
		return binarySearch(a,i,m+1,end);
	}
}
