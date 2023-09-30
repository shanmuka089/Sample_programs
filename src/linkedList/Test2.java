package linkedList;

public class Test2 {

	public static void main(String[] args) {
		DoubleLinkedListMethods<Integer> d1=new DoubleLinkedListMethods<Integer>();
		d1.add(20);
		d1.add(30);
		d1.add(40);
		d1.add(50);
		d1.remove(0);
		d1.add(80);
		d1.forwardTraverse();
		System.out.println(d1.reverseTraverse());
		System.out.println(d1.get(0));
	}

}
