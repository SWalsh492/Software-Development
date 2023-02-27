// Shane Walsh, G00406694, 14/12/21

import java.util.Scanner;

public class ShaneWalshQuestion1
{
	public static void main(String[] args)
	{
		// Declaration of variable and prompt user for count number
		int count;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number to count from: ");
		count = keyboard.nextInt();

		// Output upwards from count 10 times, using a for loop
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Counting up... " + (count));
			count++;
		}
	}
}