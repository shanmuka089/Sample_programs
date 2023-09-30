package inheritance;
class Person
{
	String name;
	Person(String n)
	{
		name=n;
	}
}
class Doctor extends Person
{
	String Spec;
	Doctor(String n,String s)
	{
		super(n);
		Spec=s;	
	}
}
public class inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1=new Doctor("shanu","java");
		System.out.println(d1.name);
		System.out.println(d1.Spec);		
	}
}
