package inheritance;
class A
{
	int i;
	int j;
	void m1(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.i=30;
		
		b1.m1(10, 20);
		b1.m2();

	}

}
