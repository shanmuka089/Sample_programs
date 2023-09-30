package stack;

public class StackMethods<T> {
	
	private Node first=null;
	private int count=0;
class Node{
	T ele;
	Node next;
	Node(T e,Node n)
	{
		ele=e;
		next=n;
	}
}
public void push(T e)
{
	if(first==null) {
		first=new Node(e,null);
		count++;
		return;
	}
	first=new Node(e,first);
	count++;
}
public T pop()
{
	if(first==null)return null;
	Node curr=first;
	first=first.next;
	return curr.ele;
}
public T peek()
{
	if(first==null)return null;
	return first.ele;
}
public int size()
{
	return count;
}
public boolean isEmpty()
{
	if(first==null)return true;
	return false;
}
}
