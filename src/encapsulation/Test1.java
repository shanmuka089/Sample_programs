package encapsulation;
class Student
{
	private int id;
	private String name;
	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int i)
	{
		if(i>0 && i<1000)
			id=i;
		else
			System.out.println("invalid id");
	}
	public int getId()
	{
		return id;
	}
}
public class Test1 {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setName("vedha");
		s1.setId(143);
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		Student s2=new Student();
		s2.setName("Shanmuka");
		s2.setId(1000);
		System.out.println(s2.getName());
		System.out.println(s2.getId());

	}

}
