package arrays;

import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		int[] a= {2,5,8,9,3,6};
		int[] b= {0,0,0,0,0,0,0,0,0};
		System.out.println(Arrays.toString(b));
//		Array copy method is predefined static method in java which has having 5 parameters.
//		a represents object a reference b represents object b reference.
//		0 represents starting index & 6 represents ending index.
		System.arraycopy(a, 0, b, 0, 6);
		System.out.println(Arrays.toString(b));
	}

}
