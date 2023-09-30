package arrays;

public class NonPrimitiveArray1 {

	public static void main(String[] args) {
		String [] s=new String[5];
		s[0]="python";
		s[1]="java";
		s[2]="c";
		s[3]="c++";
		s[4]="javascript";
		for(String a: s) {
		System.out.println(a);
		}
	}

}
