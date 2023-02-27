import java.util.Scanner;

public class average
{
	public static void main(String[] args)
	{
		int temp = 0;
		int total = 0;
		for(int i = 1; i < 5; i++)
		{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		temp = keyboard.nextInt();
		total += temp;
	}
		average(total);
	}

	public static void average(int total)
	{
		System.out.println("The average of all the numbers entered is: " + total/4);
	}

}