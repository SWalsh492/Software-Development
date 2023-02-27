import java.util.Scanner;

public class JavaIfElse2
{
	public static void main(String[] args)
	{
		double temp;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first temperature: ");
		temp = keyboard.nextDouble();


		if(temp > 25)
		{
			System.out.println("It's hot outside!");

		}
		else if(temp < 5)
		{
			System.out.println("It's cold outside!");

		}
		else
		{
			System.out.println("It's okay outside!");

		}

	}
}