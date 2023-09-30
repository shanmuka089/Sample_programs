package comparableInterface;
class Student1 implements Comparable<Student1>
{
	String name;
	int marks;
	Student1(String n,int m)
	{
		name=n;
		marks=m;
	}
	public int compareTo(Student1 arg)
	{
		return name.compareTo(arg.name);
	}
}
public class Test6 {
	public static void main(String[] args) {
	Student1 s1=new Student1("shanu",143);
	Student1 s2=new Student1("vedha",341);
	System.out.println(s1.compareTo(s2));
	}
}

