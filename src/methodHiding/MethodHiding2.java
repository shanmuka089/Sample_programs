package methodHiding;
class Q
{
	public static void m1()
	{
		System.out.println("a class prints ");
	}
}
class P extends Q
{
	public static void m1()
	{
		System.out.println("b class prints ");
	}
}
class O extends P
{
	public static void m1()
	{
		System.out.println("c class prints ");
	}
}
public class MethodHiding2{

	public static void main(String[] args)
	{
//		in method hiding the method calling is depends on reference type.
//		in these they don't depend on which object is created it total depends on reference which type.
//		the method hiding can be possible while using static methods only.
//		static can be referred by class names so the object is not mandatory they only depends reference type.
		Q y=new Q();
		y.m1();
		P x=new P();
		x.m1();
		Q z=new O();
		z.m1();
	}

}
