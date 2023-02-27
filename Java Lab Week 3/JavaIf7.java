import java.util.Scanner;

public class JavaIf7
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

		int choice;
		System.out.println("Would you like to add, subtract, divide, multiply or modulo (Enter 1 for Add, 2 for Subtract, 3 for Division, 4 for Multiply or 5 for Modulo)?: ");
		choice = keyboard.nextInt();


		if(choice == 1)
		{
			System.out.println("Answer is: " + (firstNum + secondNum));

		}
		if(choice == 2)
		{
			System.out.println("Answer is: " + (firstNum - secondNum));

		}
		if(choice == 3)
		{
			System.out.println("Answer is: " + (firstNum / secondNum));

		}
		if(choice == 4)
		{
			System.out.println("Answer is: " + (firstNum * secondNum));

		}
		if(choice == 5)
		{
			System.out.println("Answer is: " + (firstNum % secondNum));

		}

	}
}