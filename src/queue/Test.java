package queue;

public class Test {

	public static void main(String[] args) {
		QueueMethods q=new QueueMethods();
		q.add(20);
		q.add("vedha");
		q.add("shanu");
		q.add(true);
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}

}
