import java.util.Scanner;

public class JavaScanner4
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = keyboard.nextInt();
		System.out.println("Enter second number: ");
		num2  = keyboard.nextInt();
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("Sum of the two numbers entered is: " + (num1 + num2));
		System.out.println("The average of the two numbers entered is: " + ((num1 + num2)/2));

	}


}

