package shanmuka;
class CarManufacture
{
	String name;
	String color;
	String cc;
	EngineManufacture engine;
	CarManufacture(String name,String color,String cc,EngineManufacture e)
	{
		this.name=name;
		this.color=color;
		this.cc=cc;
		engine=e;
	}
	public String toString()
	{
		return String.format("name:%s  color:%s  cc:%s  engine:%s",name,color,cc,engine);
	}
}
class EngineManufacture
{
	String noOfCylinder;
	String ignitionType;
	String noOfStroke;
	EngineManufacture(String n,String i,String s)
	{
		noOfCylinder=n;
		ignitionType=i;
		noOfStroke=s;
	}
	public String toString()
	{
		return String.format("noOfCylinder:%s	ignitionType:%s	 noOfStroke:%s",noOfCylinder,ignitionType,noOfStroke);
	}
}
class Assembly
{
	CarManufacture c;
	Assembly(CarManufacture c)
	{
		this.c=c;
		System.out.println("specification of the car is;");
		System.out.println("--------------------------------------------------------");
		System.out.println(c);
		System.out.println("car is assembled and ready for the raid...");
	}
}

public class CarComposition {
	public static void main(String[]args)
	{
		EngineManufacture e1=new EngineManufacture("5","fuel ignition","4");
		CarManufacture c1=new CarManufacture("TATA","black","1000",e1);
		new Assembly(c1);
	}
}
