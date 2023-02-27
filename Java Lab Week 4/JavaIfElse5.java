import java.util.Scanner;

public class JavaIfElse5
{
	public static void main(String[] args)
	{
		int firstNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number: ");
		firstNum = keyboard.nextInt();

		int secondNum;
		System.out.println("Enter second number: ");
		secondNum = keyboard.nextInt();

		if(firstNum > secondNum)
		{
			System.out.println("The first number is greater than the second number");

		}
		else if(secondNum < firstNum)
		{
			System.out.println("The second number is greater than the first number");

		}
		else
		{
			System.out.println("The numbers are equal");
		}

	}
}