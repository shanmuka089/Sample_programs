package methodHiding;
class T
{
	int i=100;
	public void m1()
	{
		System.out.println("a class prints "+i);
	}
}
class S extends T
{
	int j=200;
	@Override
	public void m1()
	{
		System.out.println("b class prints "+j);
	}
}
class R extends S
{
//	in method overriding super keyword is used to call super class methods.
//	when the super class method implementation will be needed along with sub class implementations.
//	overriding can be possible while using non-static methods.
//	non-static methods are referred by objects so in overriding which object is call totally depends on object type. 
	int k=300;
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("c class prints "+k);
	}
}
public class MethodOverRiding
{
	public static void main(String[] args)
	{
//		in method overriding the method calling is depends on instance type.
//		super class type can hold the all types of sub class references.
		T y=new R();
		y.m1();
		T x=new S();
		x.m1();
		T z=new T();
		z.m1();
	}
}