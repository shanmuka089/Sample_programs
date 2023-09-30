package interfaces;

public interface DefaultInterface {
	static final int sum=100;
	public int add(int m, int n);
	public static void  adds(int x,int y)
	{
		System.out.println("these is the static add method "+ sum);
		
	}
	public default void show()
	{
		System.out.println("the addition of two numbers is");
	}

}
