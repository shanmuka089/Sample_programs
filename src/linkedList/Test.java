package linkedList;

public class Test {

	public static void main(String[] args) {
		singleLinkedListMethods l=new singleLinkedListMethods();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(1,"shanu");
		System.out.println(l);
		System.out.println(l.get(2));
		l.remove(1);
		System.out.println(l);
		System.out.println(l.size());
		l.reverse();
		System.out.println(l);
		l.clear();
		System.out.println(l);
	}
}
