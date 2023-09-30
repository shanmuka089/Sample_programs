package stringProgrms;
import java.util.Scanner;
import stringMethods.ReplaceCharacters;
public class CharactersReplace {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string;");
		String str=scn.nextLine();
		System.out.println("enter a character to be replace;");
		char c1=scn.next().charAt(0);
		System.out.println("enter a new replacing character;");
		char c2=scn.next().charAt(0);
		System.out.println(ReplaceCharacters.ReplaceChar(str, c1, c2));

	}

}
