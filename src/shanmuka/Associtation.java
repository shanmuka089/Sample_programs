package shanmuka;
class Bank
{
	String name;
	Bank(String name)
	{
		this.name=name;
	}
	public String displayname()
	{
		return name;
	}
}
class Employee
{
	String name;
	Employee(String name)
	{
		this.name=name;
	}
	public String displayEmployeename()
	{
		return name;
	}
}

public class Associtation {

	public static void main(String[] args) {
		
		Bank bank=new Bank("SBI");
		Employee emp=new Employee("shanmuka");
		System.out.println(emp.displayEmployeename()+" is employee of "+bank.displayname());
	}
}
