import java.util.Scanner;

public class Floatboi
{
	public static void main(String[] args)
	{
		float num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input value: ");
		num = keyboard.nextFloat();


		if(num == 0)
		{
			System.out.println("Zero");

		}
		else if(num >= 1)
		{
			System.out.println("Positive number");
		}
		else if(num < 0)
		{
			System.out.println("Negative number");

		}
		else if(num > 0 && num < 1)
		{
			System.out.println("Positive small number");
		}
		else if(num > 1000000)
		{
			System.out.println("Large");
		}





		else
		{
			System.out.println("Numbers are neither increasing or decreasing!");

		}
	}
}