import java.util.Scanner;
import java.util.Random;

public class ShaneWalshTrialQuestion2
{
	public static void main(String[] args)
	{
		int start;
		int finish;
		int randNum;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will generate a random number based on input from the user.");
		System.out.print("Enter number that random starts at: ");
		start = keyboard.nextInt();
		System.out.print("Enter number that random ends at: ");
		finish = keyboard.nextInt();

		for(int i = 0; i <= 10; i++)
		{
			Random randomNumber = new Random();
			randNum = randomNumber.nextInt(finish-start)+start;

			System.out.println(randNum);
		}
	}
}

