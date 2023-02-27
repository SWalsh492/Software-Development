import java.util.Scanner;

public class JavaWhile3
{
	public static void main(String[] args)
	{
		int num1 = 0;
		char prompt = 'y';
		Scanner keyboard = new Scanner(System.in);

		while(prompt == 'y')
		{
		System.out.println("Value of number variable is " + num1);
		num1++;
		System.out.println("Enter y to continue: ");
		prompt = keyboard.next().charAt(0);
		}

	}
}