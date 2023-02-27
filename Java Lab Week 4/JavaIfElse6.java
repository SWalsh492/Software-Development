import java.util.Scanner;

public class JavaIfElse6
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

		char operator;
		System.out.println("Enter operator: (a, s, d, m): ");
		operator = keyboard.next().charAt(0);
		if(operator == 'a' || operator == 'A')
		{
			System.out.println(firstNum + " plus " + secondNum + " is " + (firstNum + secondNum));
		}
		else if(operator == 's' || operator == 'S')
		{
			System.out.println(firstNum + " minus " + secondNum + " is " + (firstNum - secondNum));
		}
		else if(operator == 'd' || operator == 'D')
		{
			System.out.println(firstNum + " divided by " + secondNum + " is " + (firstNum/secondNum));
		}
		else if(operator == 'm' || operator == 'M')
		{
			System.out.println(firstNum + " multiplied by " + secondNum + " is " + (firstNum*secondNum));
		}

	}
}