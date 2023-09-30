package methodHiding;
class A
{
	int i=100;
	public void m1()
	{
		System.out.println("a class prints "+i);
	}
}
class B extends A
{
	int j=200;
	public void m2()
	{
		System.out.println("b class prints "+j);
	}
}
class C extends B
{
	int k=300;
	public void m3()
	{
		System.out.println("c class prints "+k);
	}
}
public class DownCasting {

	public static void main(String[] args) {
//		in UpCasting using super class type we can access super class type members & also we can hold sub class objects.
//		UpCasting is used when we need to develop a code that deals with only the parent class.
//		if you want to access subclass members then we go for down casting.
		A y=new C();
		y.m1();
//		in down casting we can access all superclass members along with sub(same)class members.  
		C d=(C)y; //Down casting
		d.m1();
		d.m2();
		d.m3();
		A x=new B();
		x.m1();
		B z=new B();
		z.m1();
		z.m2();
	}
}
