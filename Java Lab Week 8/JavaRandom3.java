import java.util.Random;
import java.util.Scanner;

public class JavaRandom3
{
	public static void main(String[] args)
	{
		int num1;

		double num2;

		Random randomNumber = new Random();

		num1 = randomNumber.nextInt(20) + 1;

		System.out.println("Random number: " + num1);

		num2 = randomNumber.nextDouble();

		System.out.println(num2);


	}

}