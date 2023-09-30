package comparatorInterface;
import java.util.Arrays;
import java.util.Comparator;
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
		return "name="+name+",marks="+marks+"\t";
	}
}
class MarksComp implements Comparator<Students>
{
	@Override
	public int compare(Students arg1,Students arg2)
	{
		return arg2.marks-arg1.marks;
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		Students[] s=new Students[5];
		s[0]=new Students("vedha",99);
		s[1]=new Students("alia",80);
		s[2]=new Students("priyanka",93);
		s[3]=new Students("shanu",97);
		s[4]=new Students("katrina",90);
		MarksComp m1=new MarksComp();
	Arrays.sort(s,m1);
	System.out.println(Arrays.toString(s));
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
	}
}


