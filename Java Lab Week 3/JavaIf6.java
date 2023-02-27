import java.util.Scanner;

public class JavaIf6
{
	public static void main(String[] args)
	{
		double n1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number: ");
		n1 = keyboard.nextDouble();

		if(n1 >= 100)
		{
			System.out.println("Number you entered is 100 or greater!");

		}
		if(n1 <= 100)
		{
			System.out.println("Number you entered is less than 100");

		}

	}
}