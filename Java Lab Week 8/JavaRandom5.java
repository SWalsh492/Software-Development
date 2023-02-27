import java.util.Random;
import java.util.Scanner;

public class JavaRandom5
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int guess;

		Random randomNumber = new Random();


		System.out.println("WELCOME TO THE MATHS ADDITION GAME");
		Scanner keyboard = new Scanner(System.in);

		for( int i = 0; i <= 6; i++)
		{
			num1 = randomNumber.nextInt(30) + 5;
			num2 = randomNumber.nextInt(30) + 5;
			System.out.println("What is " + num1 + " plus " + num2 + "? : ");
			guess = keyboard.nextInt();

			if(guess == (num1+num2))
					{
						System.out.println("Correct!");
					}
					else
					{
						System.out.println("Hmmm... that's not correct. The answer is " + (num1 + num2));
				}
		}



	}
}