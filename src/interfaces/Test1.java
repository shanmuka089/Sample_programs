package interfaces;



interface WebDriver
{
	void manufacture();
}



public class Test1 {
	public static void main(String[] args)
	{
		WebDriver driver;
		driver=new OperaMini();
		driver.manufacture();
	}
}















class Mozilla implements WebDriver
{

	@Override
	public void manufacture() {
		System.out.println("Mozilla implementation");
	}
}

class OperaMini implements WebDriver
{

	@Override
	public void manufacture() {
		System.out.println("Opera mini implemented");
	}
	
}

class ChromeDriver implements WebDriver
{
	public void manufacture()
	{
		System.out.println("Chrome implements Car....");
	}
}









