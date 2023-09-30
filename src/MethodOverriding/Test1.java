package MethodOverriding;
class Animal
{
	int x=10;
	public void eating()
	{
		System.out.println("animal eats food");
	}
	public static void eating(int x)
	{
		System.out.println("Animal eats chicken");
	}
}
class Dog extends Animal
{
	int x=30;
	public void eating()
	{
		//super keyword is used to call the overriden method from sub class to super class.
//		super.eating();
		System.out.println("dog eats bones");
	}
}
class Human extends Animal
{
	int x=20;
	public void eating()
	{
		System.out.println("human eats chicken");
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {
		Animal h1=new Human();
		h1.eating();
		System.out.println(h1.x);
		Dog d1=new Dog();
		d1.eating();
	}

}
