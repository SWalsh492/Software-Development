public class Arrays2D4
{
	public static void main(String[] args)
	{
		int[][] myCounter = new int[2][5];

		for(int row = 0; row <=1; row++)
		{
			for(int col = 0; col <=4; col++)
			{
				myCounter[row][col] = 99;
			}
		}

		for(int row = 0; row <=1; row++)
		{
			for(int col = 0; col <=4; col++)
			{
				System.out.print(myCounter[row][col] + " ");
			}
			System.out.println("\n");


		}
	}
}