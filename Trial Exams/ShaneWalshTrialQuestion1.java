import java.util.Scanner;

public class ShaneWalshTrialQuestion1
{
	public static void main(String[] args)
	{
		int incrementStep;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number for each loop increment: ");
		incrementStep = keyboard.nextInt();

		for(int i = 0; i+incrementStep <= 100; i+= incrementStep)
		{
			System.out.printf("Loop %d \n", i);
		}


	}
}