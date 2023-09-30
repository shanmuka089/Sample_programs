package encapsulation;
class Bike
{
	private String name;
	private int cost;
//	in encapsulation non-static variables cannot access inside the static methods.
//	so the non-static methods can be used.
//	constructor can also be used in encapsulation.
//	constructor can be used to initialize the variables.
	Bike(String s,int c)
	{
		name=s;
		cost=c;
	}
	public void setCost(int i)
	{
		cost=i;
	}
	public String getName()
	{
		return name;
	}
	public int getCost()
	{
		return cost;
	}
}
public class Test2 {

	public static void main(String[] args) {
		Bike b1=new Bike("FZ",100000);
		System.out.println(b1.getName());
		System.out.println(b1.getCost());
	}

}
