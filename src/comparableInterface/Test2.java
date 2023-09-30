package comparableInterface;
class Student implements Comparable
{
	String name;
	int marks;
	Student(String n,int m)
	{
		name=n;
		marks=m;
	}
	
	@Override
	public int compareTo(Object arg)
	{
		Comparable s1=name;
		Comparable s2=((Student)arg).name;
		return s1.compareTo(s2);
	}
}
public class Test2 {

	public static void main(String[] args) {
	Student s1=new Student("shanu",143);
	Student s2=new Student("vedha",341);
	System.out.println(s1.compareTo(s2));
	}
}
