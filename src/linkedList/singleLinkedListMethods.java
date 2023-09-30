package linkedList;

import java.util.ListIterator;

public class singleLinkedListMethods{
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
//	it is used to clear objects present in data structure.
	public void clear()
	{
		first=null;
		count=0;
	}
//	it is used to get the objetcs in list.
	public Object get(int index)
	{
		if(index<=-1 || index>=count) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1; i<=index; i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
//	these method is used to add the object at required index.
	public void add(int index, Object e)
	{
		if(index<=-1 || index>=count) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(e, null);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1; i<index; i++)
		{
			curr=curr.next;
		}
		Node temp=curr.next;
		curr.next=new Node(e, temp);
		count++;
		
	}
//	these method is used to remove the object at given index.
	public void remove(int index)
	{
		if(index<=-1 || index>=count) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1; i<index; i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
//	it is used to reverse the objects inside a data structure.
	public void reverse()
	{
		Node curr=first,prev=null,next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
//	it is used to print the objects in a string.
	@Override
	public String toString()
	{
		if(first==null)return "[]";
		Node curr=first.next;
		String s="["+first.ele;
		while(curr!=null)
		{
			 s+=", "+curr.ele;
			 curr=curr.next;
		}
		s+="]";
		return s;
	}
}
