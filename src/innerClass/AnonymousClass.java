package innerClass;
class Popcorn
{
	public void taste()
	{
		System.out.println("salty");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		Popcorn p=new Popcorn()
		{
			@Override
			public void taste()
			{
				System.out.println("spicy");
			}
		};
		p.taste();
		Popcorn p2=new Popcorn();
		p2.taste();
	}

}
