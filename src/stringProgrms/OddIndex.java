package stringProgrms;
import stringMethods.toPrintOddIndex;
public class OddIndex {

	public static void main(String[] args)
	{
		String s="love you soo much priyanka darling";
		toPrintOddIndex i=new toPrintOddIndex();
		System.out.println(i.indexOdd(s));
		System.out.println(i.indexOddAt(s));
		System.out.println(i.indexEven(s));
		System.out.println(i.indexEvenAt(s));
	}
}
