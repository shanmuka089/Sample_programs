package arrays;
interface Animal
{
	void makeSound();
}
class dog implements Animal
{
	@Override
	public void makeSound()
	{
		System.out.println("Bow Bow");
	}
	public void play()
	{
		System.out.println("it plays with cat");
	}
}
class cat implements Animal
{
	@Override
	public void makeSound()
	{
		System.out.println("meow meow");
	}
}
public class NonPrimitiveArray4 {

	public static void main(String[] args) {
		Animal[] arr=new Animal[4];
		arr[0]=new dog(); //auto upcasting
		arr[1]=new cat();
		arr[2]=new dog();
		arr[3]=new cat();
		
		for(Animal a:arr)
		{
			a.makeSound();
			if(a instanceof dog)
				((dog)a).play();	//down casting	
		}
	}
}
