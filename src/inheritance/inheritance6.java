package inheritance;
class AB
{
	int i;
	AB()
	{
		i=10;
	}
}
class CD extends AB
{
	int j;
	CD()
	{
		j=20;
	}
}

public class inheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD h1=new CD();
		System.out.println("i="+h1.i);
		System.out.println("j="+h1.j);
	}

}
