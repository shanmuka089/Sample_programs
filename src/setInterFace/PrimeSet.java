package setInterFace;

import java.util.HashSet;
import java.util.LinkedHashSet;

class Check
{
	public static boolean isPrime(int n)
	{
		boolean b=true;
		if(n<2)
			b=false;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				b=false;
				break;
			}
		}
		return b;
	}
}
public class PrimeSet {
	public static void main(String[] args){
		HashSet<Integer> s=new LinkedHashSet<Integer>();
		for(int i=1; i<=50; i++)
		{
			if(Check.isPrime(i))
				s.add(i);
		}
		System.out.println(s);
	}
}
