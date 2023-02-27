import java.util.Scanner;

public class JavaScanner2
{
	public static void main(String[] args)
	{
		int number1;
		int number2;
		int number3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number: ");
		number1 = keyboard.nextInt();
		System.out.println("Enter second number: ");
		number2 = keyboard.nextInt();
		System.out.println("Enter third number: ");
		number3  = keyboard.nextInt();
		System.out.println("First number entered was: " + number1);
		System.out.println("Second number entered was: " + number2);
		System.out.println("Third number entered was: " + number3);



	}
}