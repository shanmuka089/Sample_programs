package arrays;

public class MatrixMultiply {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{9,5,7},{8,7,9}};
		int [][] b= {{9,8,7},{4,5,1},{8,7,9}};
		int[][] c=new int[a.length][b.length];
		int k=0;
		int i=0;
		System.out.println(a.length);
		while(i<a.length)
		{
			int prod=1;
			int sum=0;
			for(int j=0; j<b.length; j++)
			{
				prod=a[i][j]*b[j][k];
				sum+=prod;
			}
			c[i][k]=sum;
				k++;
				if(k>a.length-1)
				{
					k=0;
					i++;
				}
		}
		for(int[] temp:c)
		{
			for(int n: temp)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
