package MethodOverriding;
// UpCasting
class piston
{
	public void gudgeonpin()
	{
		System.out.println("it connects the connecting rod & piston");
	}
	public void skert()
	{
		System.out.println("it is the part of the piston");
	}
}
class engine extends piston
{
	public void gudgeonpin()
	{
		System.out.println("engine has piston");
	}
	public void skert()
	{
		System.out.println("piston has a skert");
	}
}
class jeep extends engine
{
//	public void gudgeonpin()
//	{
//		System.out.println("jeep has gudgeonpin");
//	}
//	public void skert()
//	{
//		System.out.println("jeep has a skert");
//	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		piston p=new engine();
		p.gudgeonpin();
		p.skert();
		System.out.println("-----------------------------------------");
		piston p1=new jeep();
		p1.gudgeonpin();
		p1.skert();
	}

}
