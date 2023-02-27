import java.util.Scanner;

public class JavaSwitch8
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


		char op;
		System.out.println("Enter operator (a, s, d or m): ");
		op = keyboard.next().charAt(0);
		keyboard.close();


		switch(op)
		{
			case 'a':
			case 'A':
				System.out.println(firstNum + " plus " + secondNum + " is : " + (firstNum+secondNum));
				break;

			case 's':
			case 'S':
				System.out.println(firstNum + " minus " + secondNum + " is : " + (firstNum-secondNum));
				break;

			case 'd':
			case 'D':
				System.out.println(firstNum + " divided by " + secondNum + " is : " + (firstNum/secondNum));
				break;

			case 'm':
			case 'M':
				System.out.println(firstNum + " multiplied by " + secondNum + " is : " + (firstNum*secondNum));
				break;

			default:
				System.out.println("That is not a valid option!");



		}

	}
}