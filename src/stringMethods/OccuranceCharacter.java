package stringMethods;

public class OccuranceCharacter{
	public static int Occurance(String s,char c)
	{
		s=s.toLowerCase();
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==c)
			{
				count++;
			}
		}
		return count;
	}
}
