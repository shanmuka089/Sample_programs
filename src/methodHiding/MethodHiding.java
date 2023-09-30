package methodHiding;
class Vedha
{
	public static void DarlingName()
	{
		System.out.println("vedha darling");
	}
}
class Priyanka extends Vedha
{
	public static void DarlingName()
	{
		System.out.println("priyanka darling");
	}
}
public class MethodHiding
{
	public static void main(String[] args)
	{
		Vedha.DarlingName();
		Priyanka.DarlingName();
		Vedha v1=new Vedha();
		Vedha p1=new Priyanka();
		v1.DarlingName();
		p1.DarlingName();
	}
}
