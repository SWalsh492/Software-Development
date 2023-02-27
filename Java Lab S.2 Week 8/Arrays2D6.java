public class Arrays2D6
{
	public static void main(String[] args)
	{
		int[][] numbers = new int[6][8];

		int elements = 1;
		for(int row = 0; row <=5; row++)
		{
			for(int col = 0; col <=7; col++)
			{
				numbers[row][col] = elements;
				elements++;
			}
		}

		for(int row = 0; row <=5; row++)
		{
			for(int col = 0; col <=7; col++)
			{
				System.out.print(numbers[row][col] + " | ");
			}
			System.out.println("\n");


		}
	}
}