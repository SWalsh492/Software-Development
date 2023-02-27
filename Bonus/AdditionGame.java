import java.util.Scanner;
import java.util.Random;


public class AdditionGame
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int guess;
		int correct = 0;
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		num1 = randomNumber.nextInt(30)+5;
		num2 = randomNumber.nextInt(30)+5;

		for(int i = 0; i <=10; i++)
		{
			num1 = randomNumber.nextInt(30)+5;
			num2 = randomNumber.nextInt(30)+5;
			System.out.print(num1 + " + " + num2 + " = ");
			guess = keyboard.nextInt();
			if(guess == num1+num2)
			{
				correct++;
			}

		}

		System.out.println("Well done! You got " + correct + " correct!");



	}
}