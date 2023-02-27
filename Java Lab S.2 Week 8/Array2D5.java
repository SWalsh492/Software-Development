public class Array2D5
{
	public static void main(String[] args)
	{
		int[][] thursday = new int[5][6];

		for(int row = 0; row <=1; row++)
		{
			for(int col = 0; col <=4; col++)
			{
				thursday[row][col] = 50;
			}
		}

		for(int row = 0; row <=1; row++)
		{
			for(int col = 0; col <=4; col++)
			{
				System.out.print(thursday[row][col] + " ");
			}
			System.out.println("\n");


		}
	}
}