package shanmuka;
	class dog
	{
		private String name;
		private Human owner;
		public dog(String name,Human owner)
		{
			this.name=name;
			this.owner=owner;
		}
		public String toString()
		{
			return String.format("my name is: %s, I belongs to:%s",name,owner);
		}
	}
	class Human
	{
		private String name;
		public Human(String name)
		{
			this.name=name;
		}
		public String toString()
		{
			return name;
		}
	}
public class Composition {

	public static void main(String[] args) {
		Human man=new Human("shanu");
		dog animal=new dog("vedha",man);
		System.out.println(animal);
	}
}
