// Shane Walsh, G00406694, 26/04/2022

import java.util.Scanner;

public class ShaneWalshQuestion3
{
	public static void main(String[] args)
	{
		// Creates 2D array called table and prompts user for starting value
		int[][] table = new int[3][3];
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter first value for 2D array: ");
		int startValue = kb.nextInt();

		// Populates array with starting value and increments accordingly for each element
		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 3; col++)
			{
				table[row][col] = startValue;
				startValue++;
				System.out.print(table[row][col] + "   -   ");
			}
			System.out.println("\n");
		}

		// Allows user to amend one element by choosen their desired array position to be changed
		System.out.println("Amend a single element!");
		System.out.print("Specify row (Enter 0, 1, 2): ");
		int row = kb.nextInt();
		System.out.print("Specify column (Enter 0, 1, 2): ");
		int col = kb.nextInt();

		// Allows entry of new value and outputs the updated array
		System.out.print("Enter new value for row " + row + " and column " + col + ": ");
		table[row][col] = kb.nextInt();
		for(row = 0; row < 3; row++)
		{
			for(col = 0; col < 3; col++)
			{
				System.out.print(table[row][col] + "  -  ");
			}
			System.out.println("\n");
		}
	}
}