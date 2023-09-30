package shanmuka;

public class Pattern {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		pattern(3);

		}
		public static void pattern(int num)
		{
			int n=1;
			for(int i=1; i<=num; i++)
			{
				for (int j=1; j<=i*2; j++)
				{
					System.out.print(n+" ");
				}
				System.out.println();
		}
	}

}
