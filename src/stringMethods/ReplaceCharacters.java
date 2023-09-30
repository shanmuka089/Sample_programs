package stringMethods;

public class ReplaceCharacters
{
	public static String ReplaceChar(String s,char c1,char c2)
	{
		s=s.toLowerCase();
		String str="";
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==c1)
				ch[i]=c2;
			str+=ch[i];
		}
		return str;
	}
}
