package stringProgrms;
import stringMethods.RemoveSpacesMethod;
public class RemoveSpaces {

	public static void main(String[] args) {
		RemoveSpacesMethod str=new RemoveSpacesMethod();
		String s="love you vedha";
		System.out.println(str.RemoveSpace(s));
		String k="love	you	vedha";
		System.out.println(str.RemoveTabs(k));
		String l="love	you	vedha love you	sooo	much	kane";
		System.out.println(str.RemoveTabsSpaces(l));
		String m="love you vedha";
		System.out.println(str.RemoveManually(m));
	}
}
