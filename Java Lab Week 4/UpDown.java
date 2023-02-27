import java.util.Scanner;

public class UpDown
{
	public static void main(String[] args)
	{
		int num1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = keyboard.nextInt();

		int num2;
		System.out.println("Enter number 2: ");
		num2 = keyboard.nextInt();

		int num3;
		System.out.println("Enter number 3: ");
		num3 = keyboard.nextInt();


		if(num3 > num2  && num2 > num1)
		{
			System.out.println("Numbers are increasing in size!");

		}
		else if(num3 < num2 && num2 < num1)
		{
			System.out.println("Numbers are decreasing in size!");
		}

		else
		{
			System.out.println("Numbers are neither increasing or decreasing!");

		}
	}
}