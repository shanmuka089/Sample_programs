package stack;

public class Test {

	public static void main(String[] args) {
		StackMethods<Integer> s1=new StackMethods<Integer>();
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println(s1.peek());
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		s1.push(50);
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
	}

}
