package hashing;

public class Test {

	public static void main(String[] args) {
		HashingSetMethods h=new HashingSetMethods();
		h.add(new Student("shanu",99));
		h.add(new Student("shanu",99));
		h.add(new Student("priya",89));
		h.add(new Student("vedha",79));
		h.add(new Student("shanu",99));
		h.add(new Student("jaanu",69));
		h.display();
		System.out.println(h.size());
	}

}
class Student{
	String name;
	int marks;
	Student(String n,int m)
	{
		name=n;
		marks=m;
	}
	@Override()
	public int hashCode()
	{
		return marks;
	}
	@Override
	public boolean equals(Object arg)
	{
		return name.equals(((Student)arg).name) && marks==((Student)arg).marks;
	}
	@Override
	public String toString() {
		return "name="+name+"\tmarks="+marks;
	}
}
