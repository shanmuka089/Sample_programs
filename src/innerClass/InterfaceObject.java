package innerClass;
interface Drivers{
	public void Driving();
	public void moving();
}

public class InterfaceObject {

	public static void main(String[] args) {
		Drivers d=new Drivers() 
		{
			@Override
			public void Driving() {
				System.out.println("driver drives a car");
			}
			@Override
			public void moving() {
				System.out.println("car is moving");
			}
		};
		d.Driving();
		d.moving();
	}

}
