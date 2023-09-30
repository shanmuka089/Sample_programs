package shanmuka;

public class Student {
	static int count;
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
		count++;
	}
	public static int counts_of_student()
	{
		return count;
	}
}

