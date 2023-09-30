package comparatorInterface;
import java.util.Arrays;
import java.util.Comparator;
class Favourites implements Comparable
{
	String name;
	Favourites(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return name;
	}
	public int compareTo(Object arg)
	{
		return name.compareTo(((Favourites)arg).name);
	}
}
class nameComp implements Comparator
{
	public int compare(Object arg1,Object arg2)
	{
		System.out.println(((Favourites)arg1).name.length());
		return ((Favourites)arg2).name.length()-((Favourites)arg1).name.length();
	}
}
public class Test3 {

	public static void main(String[] args) {
		Favourites[] f1=new Favourites[4];
		f1[0]=new Favourites("Vedha");
		f1[1]=new Favourites("Shanu");
		f1[2]=new Favourites("Priyanka");
		f1[3]=new Favourites("Katrina");
		nameComp n1=new nameComp();
		Arrays.sort(f1,n1);
		System.out.println(Arrays.toString(f1));
		Arrays.sort(f1);
		System.out.println(Arrays.toString(f1));
	}

}
