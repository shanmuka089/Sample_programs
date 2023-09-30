package locale;

import java.text.NumberFormat;
import java.util.Locale;
class TestException extends Exception{}
class A{
	
	int x;
	static int y;
	
	void cal(int a, int b) {
		x+=a;
		y+=b;
	}
}


public class NumberFormatter {

		public static void main(String[] args) {
			A a=new A();
			A a2=new A();
			a.x=0;
			a.y=0;
			a.cal(1,2);
			a2.x=0;
			a2.cal(2,3);
			System.out.println(a.x+" "+a2.y );
		}
}
