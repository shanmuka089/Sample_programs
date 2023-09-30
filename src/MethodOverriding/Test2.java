package MethodOverriding;
class car
{
	void main() {
	System.out.println("car starts");
	}
	void move() {
		System.out.println("car moves");
	}
	void stop() {
		System.out.println("car stops");
	}
}
class lambhorgini extends car
{
	@Override
	void main() {
	System.out.println("lamborgini starts");
	}
	@Override
	void move() {
		System.out.println("lambhorgini moves");
	}
	@Override
	void stop() {
		System.out.println("lambhorgini stops");
	}
}
class buggati extends car
{
	@Override
	void main() {
	System.out.println("buggati starts");
	}
	@Override
	void move() {
		System.out.println("buggati moves");
	}
	@Override
	void stop() {
		System.out.println("buggati stops");
	}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambhorgini l1= new lambhorgini();
		l1.main();
		l1.move();
		l1.stop();
		buggati b1=new buggati();
		b1.main();
		b1.move();
		b1.stop();
		

	}

}
