import java.util.Random;
import java.util.Scanner;

public class JavaRandom2
{
	public static void main(String[] args)
	{
		int num1;

		Random randomNumber = new Random();

		num1 = randomNumber.nextInt(10) + 1;


		System.out.println("GUESSING GAME");
		int guess;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess the number I was thinking of!: ");
		guess = keyboard.nextInt();

		if(guess == (num1))
		{
			System.out.println("You guessed correctly!");
		}
		else
		{
			System.out.println("Sorry, that's not the number I was thinking of!");
			System.out.println("It was " + num1 + ". Better luck next time!");
		}

	}

}