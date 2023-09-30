package comparableInterface;
class Circle implements Comparable
{
	int radius;
	Circle(int r)
	{
		radius=r;
	}
	@Override
	public int compareTo(Object arg)
	{
		return radius-((Circle)arg).radius;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Circle c2=new Circle(20);
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
