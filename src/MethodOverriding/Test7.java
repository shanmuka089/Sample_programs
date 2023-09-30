package MethodOverriding;
class A
{
	int j;
	public void m1()
	{
		System.out.println("m1 method of a class");
	}
}
class B extends A
{
	int k;
	public void m2()
	{
		System.out.println("m2 method of b class");
	}
}
class C extends B
{
	int l;
	public void m3()
	{
		System.out.println("m3 method of c class");
	}
}
public class Test7 {

	public static void main(String[] args) {
//		in upCasting by using super class type variables by only access super class members
//		in upCasting we cannot access sub class variables using super class type.
//		when you need to access sub class variables during upCasting make it to downcast & use it.
		A t=new C(); //UpCasting
//		in above condition we can only access A class type variables only
		t.j=10;
		t.m1();
		B u=(B)t;
//		in above condition we can access all A & B type members because A properties are inherited to B class.
		u.j=20;
		u.m1();
		u.k=30;
		u.m2();
//		while down casting is possible upTo where it is upCasted.
		C v=(C)t;
		v.j=30;
		v.m1();
		v.k=40;
		v.m2();
		v.l=50;
		v.m3();	
	}
}
