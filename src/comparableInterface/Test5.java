package comparableInterface;
class Circle2 implements Comparable<Circle2>
{
	int radius;
	Circle2(int r)
	{
		radius=r;
	}
	@Override
	public int compareTo(Circle2 arg)
	{
		return radius-arg.radius;
	}
}
public class Test5 {
	public static void main(String[] args) {
		Circle2 c1=new Circle2(10);
		Circle2 c2=new Circle2(20);
		int res=c1.compareTo(c2);
		if(res>0) {
			System.out.println("c1 is bigger than c2");
		}else if(res<0) {
			System.out.println("c1 is smaller than c2");
		}else {
			System.out.println("both are equal");
		}
	}

}