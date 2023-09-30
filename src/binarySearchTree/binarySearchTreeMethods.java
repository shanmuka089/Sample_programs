package binarySearchTree;
import java.util.LinkedList;
import java.util.Queue;
public class binarySearchTreeMethods{
	private Node root=null;
	public boolean add(int e)
	{
		if(root==null) {
			root=new Node(e);
			return true;
		}
		Node curr=root;
		Node prev=curr;
		while(curr!=null) {
			prev=curr;
			if(e<curr.key) {
				curr=curr.left;
			}else if(e>curr.key) {
				curr=curr.right;
			}else return false;
		}
		if(e<prev.key) {
			prev.left=new Node(e);
		}else{
			prev.right=new Node(e);
		}
		return true;	
	}
	public void levelOrderTraversal() {
//		while we using Queue interface members they want to implementation for those methods.
//		linkedlist class implements queue interface.
//		so we upcasted linkedlist object has queue type then we can easily access queue interface methods.
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+" ");
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
	private void preOrder(Node n) {
		if(n==null)return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrderTraversal()
	{
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void inOrderTraversal() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null)return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	class Node
	{
		Node left;
		Node right;
		int key;
		Node(int k){
			key=k;
			left=null;
			right=null;
		}
		Node(int k,Node l,Node r){
			key=k;
			left=l;
			right=r;
		}
	}
}
