package inheritance;
class Design {
	
	Design(){
		
		System.out.println("Design()...");
	}

}

class Coding extends Design {
	
	 Coding(){
		
		System.out.println("coding()...");
	}

}

class Testing extends Coding {
	
	Testing()
	{
		
	System.out.println("Testing()...");
	}

}

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructor call order...");
		new Testing();	
	}

}
