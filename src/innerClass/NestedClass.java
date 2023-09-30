package innerClass;
class University
{
	static int n=8;
//	in static nested class we can access static members of out side nested class only.
	static class Branches
	{
		public void m1()
		{
			System.out.println("university having "+n+" branches");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
	  	University.Branches u1=new University.Branches();
	  	u1.m1();
	}

}
