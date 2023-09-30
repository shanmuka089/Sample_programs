package shanmuka;

public class Test3 {

	public static void main(String[] args) {
		int a=5;
		int b=6;
//		in logical AND operator they only one expression is executed if the expression is true then another expression is executed.
		System.out.println((a++==5)&&(++b>6));
//		in logical OR operator they only one expression is executed if the expression is true then the condition gives true.
		System.out.println((a++==9)||(++b>6));
		System.out.println(a);
		System.out.println(b);
		a=5;
		b=6;
//		in bitwise AND operator they both expressions are executed it don't depend on whether if the first expression is true or not.
		System.out.println((a++==5)&(++b>6));
//		in logical OR operator they both expressions are executed if one of the expression is true then the condition gives true.
		System.out.println((a++==6)|(++b>6));
//		in bitwise EXOR operator checks the both expressions if both conditions are either true or either false then the result is false.
		System.out.println((a++==5)^(++b>6));
		System.out.println(a);
		System.out.println(b);
	}

}
