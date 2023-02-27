import java.util.Scanner;

public class AprilTrial2
{
	public static void main(String[] args)
	{

		// Creates 2D array
		int[][] myCounter = new int[2][5];

		// Sets values to the year 2000 onwards and displays it in a neat format
		int year = 2000;
		System.out.println("------------------------------------");
		for(int row = 0; row < 2; row++)
		{
			for(int col = 0; col < 5; col++)
			{
				myCounter[row][col] = year;
				year++;
				System.out.print(myCounter[row][col] + "\t");
			}
			System.out.println();

		}
		System.out.println("\n------------------------------------");


	}
}