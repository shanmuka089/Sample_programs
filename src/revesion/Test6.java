package revesion;

public class Test6 {

	public static void main(String[] args) {
		System.out.println(anagram("silent","listens"));
	}
	static boolean anagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())return false;
		while(true) {
			char c=s1.charAt(0);
			s1=s1.replaceAll(c+"", "");
			s2=s2.replaceAll(c+"", "");
			if(s1.length()!=s2.length())
				return false;
			if(s1.length()==s2.length())
				return true;
		}
	}
	

}
