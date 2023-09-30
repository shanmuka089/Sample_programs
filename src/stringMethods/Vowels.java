package stringMethods;

public class Vowels{

	public static String Vowels(String s)
	{
		s=s.toLowerCase();
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				s1+=s.charAt(i);
			}
		}
		return s1;
	}
	public String Consonants(String k)
	{
		k=k.toLowerCase();
		String s2="";
		for(int i=0; i<k.length(); i++)
		{
			if(k.charAt(i)!='a'&&k.charAt(i)!='e'&&k.charAt(i)!='i'&&k.charAt(i)!='o'&&k.charAt(i)!='u')
			{
				s2+=k.charAt(i);
			}
		}
		return s2;
	}
	public static String Reverse(String k)
	{
		k=k.toLowerCase();
		String s2="";
		for(int i=k.length()-1; i>=0; i--)
		{
				s2+=k.charAt(i);
		}
		return s2;
	}
	public static String Lowercase(String k)
	{
		char[] c=k.toCharArray();
		String s2="";
		for(int i=0; i<k.length(); i++)
		{
			if(c[i]>'a' && c[i]<'z')
			{
				c[i]=Character.toUpperCase(c[i]);
				s2+=c[i];
			}
			else
			{
				c[i]=Character.toLowerCase(c[i]);
				s2+=c[i];
			}
		}
		return s2;
	}
	public String Conctenate(String s1,String s2) 
	{
		String s3=s1+" "+s2;
		return s3;
	}
	public String ReverseArray(String s)
	{
		char[] c=s.toCharArray();
		String str="";
		for(int i=c.length-1; i>=0; i--)
		{
			str+=c[i];
		}
		return str;
	}
}