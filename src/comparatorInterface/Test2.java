package comparatorInterface;
import java.util.Arrays;
class Number
{
	int num;
	Number(int num)
	{
		this.num=num;
	}
	@Override
	public boolean equals(Object a)
	{
		int num2=((Number)a).num;
		if(num!=num2)
			return false;
		else
			return true;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Number[] n=new Number[4];
		n[0]=new Number(20);
		n[1]=new Number(50);
		n[2]=new Number(90);
		n[3]=new Number(40);
		Number[] n2=new Number[4];
		n2[0]=new Number(20);
		n2[1]=new Number(50);
		n2[2]=new Number(90);
		n2[3]=new Number(40);
//		in below line we call arrays class static equals method it internally calls object class equals method.
		System.out.println(Arrays.equals(n,n2));
	}
}
