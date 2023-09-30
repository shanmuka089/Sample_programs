package arrays;
class multi
{
	private int i;
	multi(int i)
	{
		this.i=i;
	}
	@Override
	public String toString()
	{
		return "i="+i;
	}
}
public class NonPrimitiveArray2 {

	public static void main(String[] args) {
		multi[] m=new multi[3];
		m[0]=new multi(5);
		m[1]=new multi(10);
		m[2]=new multi(40);
		for(multi n:m) {
			System.out.println(n);
		}
	}
}
