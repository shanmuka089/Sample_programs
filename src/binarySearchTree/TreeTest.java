package binarySearchTree;

public class TreeTest {

	public static void main(String[] args) {
		binarySearchTreeMethods b1=new binarySearchTreeMethods();
		b1.add(50);
		b1.add(60);
		b1.add(40);
		b1.add(20);
		b1.add(45);
		b1.add(55);
		b1.add(65);
		b1.levelOrderTraversal();
		b1.preOrderTraversal();
		b1.postOrderTraversal();
		b1.inOrderTraversal();
	}
}
