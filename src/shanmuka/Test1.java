package shanmuka;
class Ab
{
	static int i=10;
	public static void m1()
	{
		System.out.println("i value is "+i);
	}
}
class Bc
{
	static int j=20;
	public static void m2()
	{
		System.out.println("j value is "+j);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Ab.m1();
		Bc.m2();
		System.out.println("the vale of i+j is; "+Ab.i+Bc.j);
	}

}
