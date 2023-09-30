package queue;
public class QueueMethods {
	private Node first=null;
	private int count=0;
	class Node
	{
		Object ele;
		Node next;
		Node(Object e,Node n)
		{
			ele=e;
			next=n;
		}
	}
//	in below method is used to add the objects.
	public void add(Object e)
	{
		if(first==null){
			first=new Node(e,null);
			count++;
			return;
		}
		Node last=first;
		while(last.next!=null){
			last=last.next;
		}
		last.next=new Node(e,null);
		count++;
	}
//	it is used to get the size of the data structure.
	public int size()
	{
		return count;
	}
//	below method is used to get the first object inside the data structure.
	public Object peek()
	{
		if(first==null)return null;
		return first.ele;
	}
//	below method is used to get the object after getting the object remove the object from data structure.
	public Object poll()
	{
		if(first==null)return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
}
