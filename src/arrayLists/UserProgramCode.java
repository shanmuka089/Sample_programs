package arrayLists;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserProgramCode {
	public static int validate(String s)
	{
		int r=1;
		Pattern p=Pattern.compile(s);
		Matcher m=p.matcher(s);
		if(m.matches()) {
			r=1;
		}else r=-1;
		return r;
	}

	public static void main(String[] args) {
		System.out.println(validate("adfuih@123"));
	}

}
