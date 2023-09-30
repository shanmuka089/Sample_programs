package shanmuka;

public class Test4 {

	public static void main(String[] args) {
		int i=28;
//		signed right shift.
//		i=28 --->11100(after right shift of 5 i becomes 0).
		System.out.println(i>>5);
//		i=28 --->11100(right shift of 35 first it converts binary code --->100011 it takes only last 5 digits of binary code then it gives 3).
//		after getting 3 then right shift taking place now the i value becomes 3
		System.out.println(i>>35);		
//		signed left shift.
//		i=28 --->11100(left shift of 3 then the i becomes 896).
		System.out.println(i<<5);
//		i=28 --->11100(left shift of 35 first it converts binary code --->100011 it takes only last 5 digits of binary code then it gives 3).
//		after getting 3 then left shift taking place now the i value becomes 224.
		System.out.println(i<<35);
		i=-8;
//		unsigned right shift.
//		in unsigned right shift they shift bits right side & create empty space for right side then filled with zeroes
//		i=28 --->11111111111111111111111110001000(in unsigned right shift of 3 then i becomes 536870911.
		System.out.println(i>>>3);
//		i=28 --->11111111111111111111111110001000(unsigned right shift of 35 it converts the binary code --->100011 it takes only last 5 digits of binary code then it gives 3).
//		after getting 3 then left shift taking place now the i value becomes 536870911.
		System.out.println(i>>>35);
	}

}
