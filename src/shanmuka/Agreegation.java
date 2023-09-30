package shanmuka;
class Car
{
	Engine e;
	gearbox g;
	Car(int i)
	{
		e=new Engine(i);
	}
	void moveCar(int i)
	{
		e.startEngine();
		g=new gearbox(i);
		System.out.println("car is moving");
	}
}
class Engine
{
	int cc;
	Engine(int cc)
	{
		this.cc=cc;
	}
	void startEngine()
	{
		System.out.println(cc+"cc engine is started lets make noise...");
	}		
}
class gearbox
{
	gearbox(int i)
	{
		System.out.println("gear shifted to "+i+"th gear");
	}
}
public class Agreegation {

public static void main(String[] args) {
	Car c1=new Car(2000);
	c1.moveCar(4);		
}
}
