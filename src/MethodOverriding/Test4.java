package MethodOverriding;
// UpCasting
class Caar
{
	public void start()
	{
		System.out.println("car is started");
	}
	public void moving()
	{
		System.out.println("car is moving");
	}
	public void stop()
	{
		System.out.println("car is stopped");
	}
}
class Fav extends Caar
{
	public void start()
	{
		System.out.println("Lambhorgini is started");
	}
	public void moving()
	{
		System.out.println("Lambhorgini is moving");
	}
	public void stop()
	{
		System.out.println("Lambhorgini is stopped");
	}
}
class Bmw1 extends Caar
{
	public void start()
	{
		System.out.println("Bmw is started");
	}
	public void moving()
	{
		System.out.println("Bmw is moving");
	}
	public void stop()
	{
		System.out.println("Bmw is stopped");
	}
}
class Nano1 extends Caar
{
//	public void start()
//	{
//		System.out.println("Nano is started");
//	}
//	public void moving()
//	{
//		System.out.println("Nano is moving");
//	}
//	public void stop()
//	{
//		System.out.println("Nano is stopped");
//	}
}
public class Test4 
{
	public static void main(String[] args) {
		Caar c=new Fav();
		Caar c1=new Bmw1();
		Caar c2=new Nano1();
		drive(c);
		System.out.println("-----------------------------------");
		drive(c1);
		System.out.println("-----------------------------------");
		drive(c2);
	}
	public static void drive(Caar c)
	{
		c.start();
		c.moving();
		c.stop();
	}
}
