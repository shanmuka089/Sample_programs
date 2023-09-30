package comparableInterface;

import java.util.Arrays;

class Square implements Comparable
{
	int area;
	Square(int area)
	{
		this.area=area;
	}
	public int compareTo(Object arg)
	{
		return area-((Square)arg).area;
	}
	
	@Override
	public String toString()
	{
		return "(area="+area+")";
	}
}
public class Test3 {

	public static void main(String[] args) {
		Square[] s=new Square[5];
		s[0]=new Square(10);
		s[1]=new Square(30);
		s[2]=new Square(15);
		s[3]=new Square(20);
		s[4]=new Square(25);
		Arrays.sort(s);
//		int the below line println method internally calls toString method of instance type & we get return value.
//		if the getting output is arranged in a array has a String type.
		System.out.println(Arrays.toString((s)));
	}

}
