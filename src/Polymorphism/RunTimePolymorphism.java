package Polymorphism;
class Z
{
	//runtime polymorphism can be achieved by overridenmethod.
	//method call to overriden methods or resolved at runtime based on object or instance type is known as runtime polymorphism.
	public void m1()
	{
		System.out.println("m1 method in class x");
	}
}
class Y extends Z
{
	public void m1()
	{
		System.out.println("overridden method in class Y");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		System.out.println("enter 1 for x & 2 for y");
		int op=2;
		Z m=null;
		if(op==1)
		{
			m=new Z();
		}
		else 
		{
			m=new Y();
		}
		m.m1();
	}
}


