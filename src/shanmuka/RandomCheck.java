package shanmuka;

import java.util.Random;

public class RandomCheck {

	public static void main(String[] args) {
		Random random=new Random();
		int x=10+random.nextInt(10);
		System.out.println(x);
	}
}
