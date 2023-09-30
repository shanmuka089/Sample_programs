package stringMethods;

public class RemoveSpacesMethod
{
	public String RemoveSpace(String s)
	{
		s=s.replace(" ","");
		return s;
	}
	public String RemoveTabs(String s)
	{
		s=s.replaceAll("\\t", "");
		return s;
	}
	public String RemoveTabsSpaces(String s)
	{
		s=s.replaceAll("\\s", "");
		return s;
	}
	public String RemoveManually(String s)
	{
		char []c=s.toCharArray();
		String str="";
		for(int i=0; i<c.length; i++)
		{
			if(c[i]!=' ')
				str+=c[i];
		}
		return str;
	}
}
