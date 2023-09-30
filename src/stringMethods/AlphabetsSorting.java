package stringMethods;

public class AlphabetsSorting
{
	public String sortAlphabets(String s)
	{
		String str="";
		char[] c=s.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			for(int j=i; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		for(char ch:c)
		{
			str+=ch;
		}
		return str;
	}
}
