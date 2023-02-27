import java.util.Scanner;

public class JavaScanner3
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = keyboard.nextInt();
		System.out.println("Enter second number: ");
		num2 = keyboard.nextInt();
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("Sum of numbers entered is: "+ (num1+num2));
		System.out.println("- - - - - - - - - - - - - ");
		System.out.println("Average of numbers entered is: " + ((num1 + num2)/2));




	}
}