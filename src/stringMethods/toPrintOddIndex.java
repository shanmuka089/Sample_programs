package stringMethods;
class toPrintEvenIndex
{
	public String indexEven(String S)
	{
		char[] c=S.toCharArray();
		String str="";
		for(int i=0; i<c.length; i++)
		{
			if(i%2==0)
				str+=c[i];
		}
		return str;
	}
	public String indexEvenAt(String S)
	{
		String str="";
		for(int i=0; i<S.length(); i++)
		{
			if(i%2==0)
				str+=S.charAt(i);
		}
		return str;
	}
}
//in java only public class methods can be available to call outside of the package.
//these methods can be imported & used in another package so the super class can be inherited by sub class.
public class toPrintOddIndex extends toPrintEvenIndex
{
	public String indexOdd(String S)
	{
		char[] c=S.toCharArray();
		String str="";
		for(int i=0; i<c.length; i++)
		{
			if(i%2!=0)
				str+=c[i];
		}
		return str;
	}
	public String indexOddAt(String S)
	{
		String str="";
		for(int i=0; i<S.length(); i++)
		{
			if(i%2!=0)
				str+=S.charAt(i);
		}
		return str;
	}
}
