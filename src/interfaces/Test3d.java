package interfaces;

public class Test3d {
//	Factory Class OR Object Creation Logic
	public static Test3 getCar(String name)
	{
		if(name.equalsIgnoreCase("Test3a"))
		{
			Test3a t=new Test3a();
			return t;
		}
		else if(name.equalsIgnoreCase("Test3b"))
		{
			Test3b t=new Test3b();
			return t;
		}
		else
			return null;
	}
}
