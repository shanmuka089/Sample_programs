package stringProgrms;
import java.util.Scanner;
import stringMethods.OccuranceCharacter;
public class CharacterInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string;");
		String s=scn.nextLine();
		System.out.println("enter a character to which character to be count;");
		char c=scn.next().charAt(0);
		System.out.println(OccuranceCharacter.Occurance(s,c));
	}
}
