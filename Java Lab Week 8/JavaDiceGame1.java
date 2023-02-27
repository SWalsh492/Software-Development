import java.util.Random;
import java.util.Scanner;

public class JavaDiceGame1
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
		System.out.print("What side will the dice land on?: ");
		guess = keyboard.nextInt();

		if(guess == (dice))
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Aw, you lost.");
			System.out.println("It was " + dice + ". Better luck next time!");
		}

	}

}