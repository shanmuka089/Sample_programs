package binarySearchTree;
class Student implements Comparable
{
	int roll;
	String name;
	Student(int r,String n)
	{
		roll=r;
		name=n;
	}
	@Override
	public int compareTo(Object arg)
	{
		return name.compareTo(((Student)arg).name);
	}
	@Override
	public String toString()
	{
		return "roll="+roll+"  name="+name;
	}
}
public class Test2 {

	public static void main(String[] args) {
		Student s1=new Student(50,"shanu");
		Student s3=new Student(30,"vedha");
		Student s2=new Student(100,"harsha");
		Student s4=new Student(10,"priya");
		Student s5=new Student(40,"jaanu");
		Student s6=new Student(70,"priyanka");
		Student s7=new Student(150,"darling");

		BinarySearchRecursion b1=new BinarySearchRecursion();
		b1.add(s1);
		b1.add(s2);
		b1.add(s3);
		b1.add(s4);
		b1.add(s5);
		b1.add(s6);
		b1.add(s7);
		b1.levelOederTraversal();
		b1.preOrderTraversal();
		b1.postOrderTraversal();
		b1.inOrderTraversal();
	}

}
