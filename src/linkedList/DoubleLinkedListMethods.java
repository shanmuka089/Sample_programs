package linkedList;

public class DoubleLinkedListMethods<E> {
	private Node first=null;
	private int count=0;
	private Node last=null;
	
	class Node
	{
		E ele;
		Node next;
		Node previous;
		Node(E e,Node n,Node p)
		{
			ele=e;
			next=n;
			previous=p;
		}
	}
	public void add(E e)
	{
		if(first==null) {
			first=new Node(e,null,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null,last);
		count++;
		last=last.next;
	}
	public void forwardTraverse()
	{
		Node curr=first.next;
		System.out.print("["+first.ele);
		while(curr!=null)
		{
			System.out.print(" "+curr.ele);
			curr=curr.next;
		}
		System.out.println("]");
	}
	public String reverseTraverse()
	{
		if(last==null)return null;
		Node curr=last.previous;
		String s="["+last.ele;
		for(int i=1; i<count; i++)
		{
			s+=" "+curr.ele;
			curr=curr.previous;
		}
		s+="]";
		return s;
	}
	public int size()
	{
		return count;
	}
	public void clear()
	{
		first=null;
		last=null;
		count=0;
	}
	public E get(int index)
	{
		if(index<=-1 || index>=count) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0; i<index; i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
//	public void add(int index,E e1)
//	{
//		if(index<=-1 || index>=count) {
//			throw new IndexOutOfBoundsException();
//		}
//		Node curr=first;
//		for(int i=1; i<index; i++)
//		{
//			curr=curr.next;
//		}
//		curr.next=new Node(e1,temp1,temp2);
//	}
	public void remove(int index)
	{
		if(index<=-1 || index>=count) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			return;
		}
		Node curr1=first;
		for(int i=1; i<index; i++)
		{
			curr1=curr1.next;
		}
		curr1.next=curr1.next.next;
	}
}
