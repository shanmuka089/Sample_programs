package Abstraction;
abstract class Car
{
	//inside abstract class we can create a constructors,abstract methods,concrete methods.
	//for abstract class we didn't create object.
	//while presenting the abstract method the class must be declared with abstract class.
	//the abstract methods are used to hide the implementations.
	//abstract classes forces the subclasses to provide the implementations for abstract methods.
	//if subclass face to override abstract methods the class becomes abstract & they cannot create object for this class.
	Car()
	{
		System.out.println("inside abstract class we can create constructor");
	}
	public abstract void start();
	public abstract void move();
	public abstract void stop();
}
class Buggati extends Car
{
	public void start()
	{
		System.out.println("Buggati starts...");
	}
	public void move()
	{
		System.out.println("Buggati moving");
	}
	public void stop()
	{
		System.out.println("Buggati stop");
	}
}
class Bmw extends Car
{
	public void start()
	{
		System.out.println("Bmw starts...");
	}
	public void move()
	{
		System.out.println("Bmw moving");
	}
	public void stop()
	{
		System.out.println("Bmw stop");
	}
}
class Tata extends Car
{
	public void start()
	{
		System.out.println("Tata starts...");
	}
	public void move()
	{
		System.out.println("Tata moving");
	}
	public void stop()
	{
		System.out.println("Tata stop");
	}
}
class Vehicle
{
	public void Vehicle(Car c)
	{
		c.start();
		c.move();
		c.stop();
	}
}
public class Test1 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Tata t=new Tata();
		v.Vehicle(t);
	}
}
