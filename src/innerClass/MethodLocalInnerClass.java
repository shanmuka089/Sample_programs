package innerClass;
class Test
{
	String s="Test starts";
	static int z=150;
	public void m1(){
		class Sum
		{	int x=140;
			static int y=160;
			public void sum(int x, int y)
			{
				System.out.println("sum of "+x+" + "+y+" is "+(x+y));
				int m=this.x+this.y;
				System.out.println(m);
				System.out.println(s);
				System.out.println(z);
			}
		}
		Sum s=new Sum();
		s.sum(10,20);
		s.sum(30,40);
		s.sum(50,60);
		s.sum(70,80);
		s.sum(90,100);
	}
	public static void m2(){
		class Sum
		{	
			static int m=160;
			public static void sum(int x, int y)
			{
				System.out.println("sum of "+x+" + "+y+" is "+(x+y));
				System.out.println(m);
				System.out.println(z);
//				System.out.println(s);
			}
		}
		System.out.println(Sum.m);
//		System.out.println(s);
		System.out.println(z);
		Sum s=new Sum();
		s.sum(10,20);
		s.sum(30,40);
		s.sum(50,60);
		s.sum(70,80);
		s.sum(90,100);
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		Test.m2();
	}

}
