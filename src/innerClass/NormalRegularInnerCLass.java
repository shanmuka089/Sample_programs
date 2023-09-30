package innerClass;
interface Driver
{
	public void drive();
}
class Car{
	String s;
	private static int num=1000;
//	in inner class we can access both static and nonstatic members of out side class.
	Car(String s)
	{
		this.s=s;
	}
	public Driver getDriver()
	{
		return new Engine();
	}
	
	class Engine implements Driver{
		public void drive() {
			System.out.println("Driver drives "+s+" car of "+(num+=200)+" bhp");
		}
	}
}
public class NormalRegularInnerCLass {
	public static void main(String[] args) {
		Car g=new Car("toyota");
		Driver h=g.getDriver();
		h.drive();
		Car c=new Car("lambhorgini");
		Driver d=c.getDriver();
		d.drive();
		Car e=new Car("buggati");
		Driver f=e.getDriver();
		f.drive();
	}

}
