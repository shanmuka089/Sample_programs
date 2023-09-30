package arrayLists;

public class Test {

	public static void main(String[] args) {
		ArrayListMethods a=new ArrayListMethods();
		a.add("shanu");
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(60);
		a.add("vedha");
		a.add(10.2);
		a.add(true);
		a.add('a');
		a.add("jaanu");
		a.add(3,"priya");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.capacity());
		System.out.println(a.get(5));
		a.remove(5);
		System.out.println(a);
		a.add(5,"priyanka");
		System.out.println(a);
		a.clear();
		System.out.println(a);
		
	}

}
