package stringProgrms;
//	in the below line i import class(AlphabetsSorting) from another package(stringMethods).
// package is nothing but another package only.
import stringMethods.AlphabetsSorting;
public class SortingAlphabets {

	public static void main(String[] args) {
		String s="MNODCBAE";
		AlphabetsSorting a=new AlphabetsSorting();
		System.out.println(a.sortAlphabets(s));

	}

}
