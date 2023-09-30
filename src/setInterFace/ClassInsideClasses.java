package setInterFace;

public class ClassInsideClasses {

	public static void main(String[] args) {
//		inner class main
		InnerClass1 i1=new InnerClass1();
		InnerClass1.prints();
		i1.print();
		InnerClass1.InnerClass2.prints2();
		InnerClass1.InnerClass2.prints21();
		InnerClass1.InnerClass2 i3=i1.new InnerClass2();
		i3.print2();
		
		InnerClass1.InnerClass2 i2=new InnerClass1().new InnerClass2();
		i2.print21();
		System.out.println("---------------------------------------------------------------------------");
//		nested class main
		NestedClass1.prints();
		NestedClass1.NestedClass2.prints2();
		NestedClass1.NestedClass2.prints21();
		NestedClass1.NestedClass2 n1=new NestedClass1.NestedClass2();
		n1.print2();
		n1.print21();
		NestedClass1 n2=new NestedClass1();
		n2.print();
		System.out.println("----------------------------------------------------------------------------");
//		Anonymous class main
		AnonymousClass1.prints();
		AnonymousClass1 a2=new AnonymousClass1();
		a2.print();
		a2.a1.print2();
		a2.a1.print21();
	}

}
//Inner classes
class InnerClass1{
	int int_ger=143;
	String name="Shannu";
	static int int_gers=341;
	static String names="vedha";
	public void print()
	{
		System.out.println(int_ger+" , "+name+" loves "+names);
	}
	public static void prints()
	{
		System.out.println(int_gers+" , "+names);
	}
	class InnerClass2{
		int int_ger2=286;
		String name2="Shannu2";
		static int int_gers2=682;
		static String names2="vedha2";
		public void print2()
		{
			System.out.println(int_ger2+" , "+name2+" loves "+names2);
		}
		public void print21()
		{
			System.out.println(int_ger+" , "+name+" loves "+names);
		}
		public static void prints2()
		{
			System.out.println(int_gers2+" , "+names2);
		}
		public static void prints21()
		{
			System.out.println(int_gers+" , "+names);
		}
		
	}
}
//	Nested class
class NestedClass1{
	int int_ger=143;
	String name="Shannu";
	static int int_gers=341;
	static String names="vedha";
	public void print()
	{
		System.out.println(int_ger+" , "+name+" loves "+names);
	}
	public static void prints()
	{
		System.out.println(int_gers+" , "+names);
	}
	static class NestedClass2{
		int int_ger2=286;
		String name2="Shannu2";
		static int int_gers2=682;
		static String names2="vedha2";
		public void print2()
		{
			System.out.println(int_ger2+" , "+name2+" loves "+names2);
		}
		public void print21()
		{
			System.out.println(int_gers+" , "+names+" loves "+names);
		}
		public static void prints2()
		{
			System.out.println(int_gers2+" , "+names2);
		}
		public static void prints21()
		{
			System.out.println(int_gers+" , "+names);
		}
		
	}
}
//	Anonymous class
interface AnonymousClass2{
	public void print2();
	public void print21();
}
class AnonymousClass1{
	int int_ger=143;
	String name="Shannu";
	static int int_gers=341;
	static String names="vedha";
	public void print()
	{
		System.out.println(int_ger+" , "+name+" loves "+names);
	}
	public static void prints()
	{
		System.out.println(int_gers+" , "+names);
	}
	AnonymousClass2 a1=new AnonymousClass2(){
		int int_ger2=286;
		String name2="Shannu2";
		static int int_gers2=682;
		static String names2="vedha2";
		public void print2()
		{
			System.out.println(int_ger2+" , "+name2+" loves "+names2);
		}
		public void print21()
		{
			System.out.println(int_gers+" , "+names+" loves "+names);
			prints2();
			prints21();
		}
		public static void prints2()
		{
			System.out.println(int_gers2+" , "+names2);
		}
		public static void prints21()
		{
			System.out.println(int_gers+" , "+names);
		}
		
	};
}