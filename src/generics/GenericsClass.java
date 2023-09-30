package generics;

public class GenericsClass {

	public static void main(String[] args) {
		Generica<Integer> a=new Generica<>();
		String s=a.<String>m1("shanu");
		int i=a.<Integer>m2(143);
		char c=a.<Character>m3('A');
		System.out.println(s);
		System.out.println(i);
		System.out.println(c);
//		-------------------------------------------
		
		Genericb<Generica> b=new Genericb<Generica>();
		Genericc i1=b.m1(a);
		System.out.println(i1);
		
	}

}
// the below class having Generic Parameter it extends another Parameter type.
// when we extends another parameter type it allows all subclasses type can also take has parameter.
class Genericb<T extends Genericc>
{
	public T m1(T a)
	{
		return a;
		
	}
	public  T m2(T i)
	{
		return i;
	}
	public  T m3(T j)
	{
		return j;
	}
	
}
// these class is super class for Generica class.
// we can give parameter type for each methods individually.
// it helps to allow different parameter types for a method in a single class.
class Genericc
{
	public <T> T m1(T a)
	{
		return a;
		
	}
	public <E> E m2(E i)
	{
		return i;
	}
	public <F> F m3(F j)
	{
		return j;
	}
}
// we can give argument type for methods explicitly through class name. 
//	these genrics helps to minimize downcasting task.
//	when we giva parameter in class name it is cammon for all methods.
class Generica<T> extends Genericc
{
	public <T> T m11(T a)
	{
		return a;
		
	}
	public T m21(T i)
	{
		return i;
	}
	public  T m31(T j)
	{
		return j;
	}
}