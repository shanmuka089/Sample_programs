package interfaces;
interface Aeroplane
{
	void design();
}
interface Rocket extends Aeroplane
{
//	void design();
	void manufacture();
}
abstract class Cars
{
	abstract void design();
}
class Bike extends Cars
{
	public void design()
	{
		System.out.println("Car can be designed by Mechanical engineer....");
	}
	public void design1()
	{
		System.out.println("bike can be designed by mechanic.....");
	}
}
class Mechanic extends Bike implements Aeroplane,Rocket
{ 
	public void design()
	{
		System.out.println("Aeroplane can be design by engineers...");
	}
	public void manufacture()
	{
		System.out.println("Rockets can be designed by scientists...");
	}
}
public class Test2 {

	public static void main(String[] args)
	{	
		Bike m=new Mechanic();
//		in this we call to design implemented method can be executed.
//		because implemented method can have more possibility compare inherited methods.
		m.design();
		m.design1();
		Rocket a=new Mechanic();
		a.design();
		a.manufacture();
		
	}

}
