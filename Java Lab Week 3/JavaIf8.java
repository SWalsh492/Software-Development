import java.util.Scanner;

public class JavaIf8
{
	public static void main(String[] args)
	{
		double firstNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number: ");
		firstNum = keyboard.nextDouble();

		double secondNum;
		System.out.println("Enter second number: ");
		secondNum = keyboard.nextDouble();

		if(firstNum > secondNum)
		{
			System.out.println("The first number, " + firstNum + " is greater than the second number, " + secondNum);

		}
		if(firstNum < secondNum)
		{
			System.out.println("The second number, " + secondNum + " is greater than the first number, " + firstNum);

		}
		if(firstNum == secondNum)
		{
			System.out.println("The numbers are the same!");

		}



	}
}