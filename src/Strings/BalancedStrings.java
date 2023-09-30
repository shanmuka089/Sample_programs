package Strings;

public class BalancedStrings {

	public static void main(String[] args) {
		int i=20;
		int j=30;
		System.out.println("before swapping i becomes "+i+" & j becomes "+j);
//     	swapping using temporary variable
		int temp=i;
		i=j;
		j=temp;
		System.out.println("after swapping using temp variable i becomes "+i+" & j becomes "+j);
//		swapping without temporary variable
		i=20;j=30;
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("after swapping without temp variable i becomes "+i+" & j becomes "+j);
//		swapping using exor operator
		i=20;j=30;
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println("after swapping using EXOR operator i becomes "+i+" & j becomes "+j);
//		swapping using divison & multiple operators
		i=20;j=30;
		i=i*j;
		j=i/j;
		i=i/j;
		System.out.println("after swapping using divison & multiple operators i becomes "+i+" & j becomes "+j);
	}

}
