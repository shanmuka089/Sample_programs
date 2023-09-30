package comparableInterface;
import java.util.Arrays;
class Students implements Comparable
{
	String name;
	int marks;
	Students(String n,int m)
	{
		name=n;
		marks=m;
	}
	public int compareTo(Object arg)
	{
//		in the below statements we don't know which type of objects are using.
//		we want to cast the object with common type for all objects so we use comparable interface for all type.
		Comparable s1=name;
		Comparable s2=((Students)arg).name;
		return s1.compareTo(s2);
	}
	@Override
	public String toString()
	{
		return "name="+name+",\tmarks="+marks;
	}
}
public class Test4 {

	public static void main(String[] args) {
		Students[] s=new Students[5];
		s[0]=new Students("vedha",99);
		s[1]=new Students("alia",80);
		s[2]=new Students("priyanka",97);
		s[3]=new Students("shanu",97);
		s[4]=new Students("katrina",90);
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
	}
}
