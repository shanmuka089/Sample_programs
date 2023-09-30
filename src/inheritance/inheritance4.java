package inheritance;
class G
{
	G(){
	System.out.println("C internally call Object constructor");
	//object class constructor is a default constructor it is provided by JDK people
	//object class constructor having non-static methods
	//if you need to use these predefined nonstatic methods we call these throw constructor
	//if you donot create any constructors in class file 
	//the java implicitly create one default constructor at the time of object creation
	//in constructor java internally having default call(super())which is call implicitly default object class constructor
	//after calling those predefined methods can be access using object reference
	//super keyword must be in first line because to invoke the super class and make a constructor chain
	}
}
class F extends G
{
	F()
	{
		System.out.println("F internally calls G");
		//in these case you donot provide any keyword to call constructor java implicitly call default constructor
		//the default constructor donot have any argument so the java implicit call(super()) also donot have any argument
		//if you have any arguments in super class costructor you need to call explicitly with using arguments
	}
}
public class inheritance4
{
	public static void main(String[]args)
	{
		F f1=new F();
		String s=f1.toString();
		System.out.println(s);
		int u=f1.hashCode();
		System.out.println(u);
	}
}
