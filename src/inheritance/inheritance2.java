package inheritance;
class C
{
	int i;
	int j;
	static String l;
	C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	static void dis()
	{
		l="love";
	}
	C(String s)
	{
		System.out.println("s for "+s);
	}
}
class D extends C
{
	static String v;
	D(int i,int j)
	{
		super(i,j);
	}
	static void display()
	{
		dis();
		v=" you vedha";
		System.out.println(l+v);
	}
	D(String s)
	{
		super(s);
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D initialize=new D(10,20);
new D("shannu");
System.out.println("i="+initialize.i);
System.out.println("j="+initialize.j);
D.display();
String s=initialize.toString();
System.out.println(s);
	}
}
