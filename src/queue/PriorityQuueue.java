package queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;
class Student implements Comparable
{
	int id;
	String name;
	int marks;
	Student(int i,String n,int m)
	{
		id=i;
		name=n;
		marks=m;
	}
	@Override
	public String toString()
	{
		return "id="+id+" name="+name+" marks="+marks;
	}
	@Override
	public int compareTo(Object arg)
	{
		return id-((Student)arg).id;
	}
}
public class PriorityQuueue {

	public static void main(String[] args) {
		Queue<Student> ab=new PriorityQueue<Student>();
		ab.add(new Student(101,"shanu",99));
		ab.add(new Student(501,"vedha",93));
		ab.add(new Student(401,"priyanka",69));
		ab.add(new Student(301,"jaanu",78));
		ab.add(new Student(801,"chinnu",94));
		ab.add(new Student(901,"darling",89));
		System.out.println(ab);
	}

}
