import java.util.Scanner;

public class Arrays2D8
{
	public static void main(String[] args)
	{
		int[][] puzzle = new int[3][3];

		puzzle[0][0] = 5;
		puzzle[0][1] = 9;
		puzzle[0][2] = 18;
		puzzle[1][0] = 6;
		puzzle[1][1] = 22;
		puzzle[1][2] = 4;
		puzzle[2][0] = 6;
		puzzle[2][1] = 4;
		puzzle[2][2] = 7;

			for(int row = 0; row <=2; row++)
			{
				for(int col = 0; col <=2; col++)
				{
					System.out.print(puzzle[row][col] + " | ");
				}
				System.out.println("\n");
			}

		Scanner kb = new Scanner(System.in);
		System.out.println("Add all the values of what column? (Enter 0,1 or 2): ");
		int input = kb.nextInt();
		int columnTotal = 0;

		for(int i = 0; i <= puzzle.length-1; i++)
		{
			columnTotal += puzzle[i][input];
		}
		System.out.println("The addition of all the values in column is: " + columnTotal);

	}
}