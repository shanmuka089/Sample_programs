package shanmuka;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(1);
	}
	public static void m1(int i)
	{
		System.out.println(i);
		if(i>=3)return;
		m1(++i);
		m1(++i);
		System.out.println(i);
		
	}

}
