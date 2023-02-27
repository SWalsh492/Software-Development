import java.util.Scanner;

public class JavaWhile4
{
	public static void main(String[] args)
	{
		int num1 = 1;
		Scanner keyboard = new Scanner(System.in);
		int total = 0;

		while(num1 > 0)
		{
			System.out.println("Enter a number: ");
			num1 = keyboard.nextInt();
			total = total + num1;
		}
		System.out.println("Sum of all numbers entered is: " + total);

	}
}