package inheritance;
class X
{
	X()
	{
		super();
		System.out.println("ctt in X");
	}
}
class Y extends X
{
	Y()
	{
		super();
		System.out.println("ctt in Y");	
	}
}
class Z extends Y
{
	Z()
	{
		super();
		System.out.println("ctt in Z");
	}
}

public class inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Z();
	}
}
