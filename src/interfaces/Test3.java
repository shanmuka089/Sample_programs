package interfaces;

public interface Test3 {
//	interface showing functionality to the users
//	interface is used to achieve 100% abstraction
	void engine();
	void body();
	void speed();
	default void airbags()
	{
		System.out.println("the cars must contain air bags");
	}
}
