package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchRecursion{
	Node root=null;
	private boolean flag=false;
	public boolean add(Object k)
	{
		flag=true;
		root=addNode(root,k);
		return flag;
	}
	private Node addNode(Node n,Object key)
	{
		if(n==null) {
			return new Node(key);
		}
//	in below line we down cast to Student type because we provide the implementation for compareTo method in Student class.
//	if we access the subclass member then object should be subclass type.
//  in below object is object type so we down cast to student type then we can easily access to compareTo method.
		if(((Student)n.key).compareTo(key)<0) {
			n.right=addNode(n.right,key);
		}else if(((Student)n.key).compareTo(key)>0) {
			n.left=addNode(n.left,key);
		}else flag=false;
		return n;
	}
	public void levelOederTraversal()
	{
//		in the below line we give genric type because it default stores object type.
//		so we can use genric type for which type we need.
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+"\t");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	public void preOrderTraversal()
	{
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n)
	{
		if(n==null)return;
		System.out.print(n.key+"\t");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrderTraversal()
	{
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n)
	{
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+"\t");
	}
	public void inOrderTraversal()
	{
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n)
	{
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+"\t");
		inOrder(n.right);
	}
	class Node
	{
		Object key;
		Node left;
		Node right;
		Node(Object k)
		{
			key=k;
			left=null;
			right=null;
		}
		Node(Object k,Node l,Node r)
		{
			key=k;
			left=l;
			right=r;
		}
	}
	

}
