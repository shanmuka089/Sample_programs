package interfaces;

import java.util.Scanner;

public class Test3c {
// user Logic OR consumer Logic
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car name");
		String s=sc.next();
		Test3d t=new Test3d();
		Test3 Car=t.getCar(s);
		Car.engine();
		Car.body();
		Car.speed();
		Car.airbags();
	}

}
