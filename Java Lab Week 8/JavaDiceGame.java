import java.util.Random;
import java.util.Scanner;

public class JavaDiceGame
{
	public static void main(String[] args)
	{
		int dice;

		Random randomNumber = new Random();

		dice = randomNumber.nextInt(6) + 1;


		System.out.println("LUCKY DICE GAME");
		System.out.println("Place your bets!!");
		int guess;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What side will the dice land on?: ");
		guess = keyboard.nextInt();

		if(guess == (dice))
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Aw, you lost. Better luck next time.");
			System.out.println("It was " + dice + ". Better luck next time!");
		}

	}

}