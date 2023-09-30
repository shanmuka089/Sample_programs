package Abstraction;
abstract class A
{
	public abstract void m1();
}
abstract class B extends A
{
	public abstract void m2();
}
class C extends B
{
	public void m1()
	{
		System.out.println("abstract method from A");
	}
	public void m2()
	{
		System.out.println("abstract method from B");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C t=new C();
		t.m1();
		t.m2();
	}
}
