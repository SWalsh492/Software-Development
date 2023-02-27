import java.util.Scanner;

public class JavaLO2
{
	public static void main(String[] args)
	{
		int amount1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Amount 1: ");
		amount1 = keyboard.nextInt();

		int amount2;
		System.out.println("Enter Amount 2: ");
		amount2 = keyboard.nextInt();

		if(amount1 > 10 && amount2 < 100)
		{
			System.out.println("Amount 1 is greater than 10");
			System.out.println("Amount 2 is less than 100");

		}
		else
		{
			System.out.println("The numbers are not in the specified range");
		}
	}
}