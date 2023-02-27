import java.util.Random;
import java.util.Scanner;

public class JavaDiceGame2
{
	public static void main(String[] args)
	{
		int dice1;
		int dice2;

		Random randomNumber = new Random();

		dice1 = randomNumber.nextInt(6)+1;
		dice2 = randomNumber.nextInt(6)+1;

		System.out.println("LUCKY DICE GAME");
		System.out.println("Place your bet!!");
		int guess;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Whats your bet?: ");
		guess = keyboard.nextInt();
		System.out.println("Dice 1: "+ dice1);
		System.out.println("Dice 2: "+ dice2);

		if(guess == (dice1 + dice2))
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Aw, you lost. Better luck next time.");
		}

	}

}