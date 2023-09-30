package innerClass;
abstract class Darlings{
	public abstract void wife();
	public abstract void darling();
}
public class AbstractClassObject {

	public static void main(String[] args) {
		
		Darlings d=new Darlings() {
			@Override
			public void wife()
			{
				System.out.println("vadha is my wife");
			}
			@Override
			public void darling()
			{
				System.out.println("priyanka is my darling");
			}
		};
		d.wife();
		d.darling();
	}

}
