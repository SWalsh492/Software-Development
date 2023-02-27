import java.util.Scanner;
import java.util.Random;


public class GuessingGame
{
	public static void main(String[] args)
	{
		int num1;
		int counter = 1;
		int guess;
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		num1 = randomNumber.nextInt(100)+1;


		do{
			counter++;
			System.out.print("Guess a number between 1 and 100: ");
			guess = keyboard.nextInt();
			if(guess == num1)
			{
				System.out.println("Congratulations! You win!");
			}
			else if(guess > num1)
			{
				System.out.println("Too high");
			}
			else if(guess < num1)
			{
				System.out.println("Too low");
			}

		}while(counter <=6 && guess != num1);

		System.out.println("Sorry you didn't win. The answer was " + num1);

	}
}