package MethodOverriding;
class Subject
{
	public void content()
	{
		System.out.println("subject have some content...");
	}
}
class Javasubject extends Subject
{
	public void content()
	{
		System.out.println("subject have java topics");
	}
}
class Chemistrysubject extends Subject
{
	public void content()
	{
		System.out.println("subject have chemical reactions");
	}
}
class Mathssubject extends Subject
{
	public void content()
	{
		System.out.println("subject have mathematical equations");
	}
}
class Student
{
	public void study(Subject s)
	{
		System.out.println("STudent study......");
		s.content();
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Javasubject j=new Javasubject();
		Chemistrysubject c=new Chemistrysubject();
		Mathssubject m=new Mathssubject();
		s.study(m);
	}
}
