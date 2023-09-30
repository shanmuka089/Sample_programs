package shanmuka;

public class Counter {
	static {
		
		System.out.println(Student.counts_of_student());
	}
	public static void main(String[] args) {

		Student s1=new Student(101,"Shanu");
		Student s2=new Student(101,"Shanu");
		Student s3=new Student(101,"Shanu");
		Student s7=new Student(101,"Shanu");
		Student s4=new Student(101,"Shanu");
		Student s5=new Student(101,"Shanu");
		Student s6=new Student(101,"Shanu");
		
		System.out.println("the number of students are "+Student.counts_of_student());
	}

}
