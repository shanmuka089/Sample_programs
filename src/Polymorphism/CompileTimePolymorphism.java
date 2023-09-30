package Polymorphism;
class X
{
	//compile time polymorphism can be achieved by method overloading.
	//method call to overloaded methods or resolved at compile time based on arguments & parameter is known as compile time polymorphism.
	public void m1()
	{
		System.out.println("m1 method in class X");
	}
	public int m2(int n)
	{
		System.out.println("m2 method in class X "+n);
		return n;
	}
	public void m3(String s)
	{
		System.out.println("m3 method in class "+s);
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
	X t=new X();
	t.m1();
	t.m2(10);
	t.m3("shanu");
	}
}
