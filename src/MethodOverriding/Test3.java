package MethodOverriding;
class phone
{
	public void call(int i)
	{
		System.out.println("call connected");
	}
}
class smartphone extends phone
{
	@Override
	public void call(int i)
	{
		super.call(10);
		System.out.println("with 5g network");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p=new phone();
		p.call(10);
		System.out.println("-------------------------------------------------");
		smartphone s=new smartphone();
		s.call(10);
		

	}

}
