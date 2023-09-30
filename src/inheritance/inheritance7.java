package inheritance;
class EF
{
	EF(int i)
	{
		System.out.println("parametrized ctt in EF");
	}
}
class GH extends EF
{
	GH()
	{
		super(10);
		System.out.println("default ctt in class GH");
	}
}
public class inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GH();
	}
}
