package hashing;

public class HashingSetMethods {
	private Node[] arr=new Node[16];
	int count=0;
	public void add(Object key)
	{
		int loc=key.hashCode()%16;
		if(arr[loc]==null) {
			arr[loc]=new Node(key,null);
			count++;
		}
		Node curr=arr[loc];
		Node prev=null;
		while(curr!=null) {
			prev=curr;
			if(curr.key.equals(key))return;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
	}
	public void display() {
		for(int i=0; i<arr.length; i++) {
		Node curr=arr[i];
		while(curr!=null) {
			System.out.println(curr.key);
			curr=curr.next;
			}
		}
	}
	public int size() {
		return count;
	}
	class Node
	{
		Object key;
		Node next;
		
		Node(Object k,Node n)
		{
			key=k;
			next=n;
		}
	}
}
