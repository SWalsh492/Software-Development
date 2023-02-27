import java.util.Random;
import java.util.Scanner;

public class JavaRandom4
{
	public static void main(String[] args)
	{
		int num1;

		int num2;


		Random randomNumber = new Random();

		num1 = randomNumber.nextInt(30);

		num2 = randomNumber.nextInt(30);

		System.out.println("Random number: " + num1);
		System.out.println("Random number: " + num2);

	}
}