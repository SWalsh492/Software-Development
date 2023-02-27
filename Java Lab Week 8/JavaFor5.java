import java.util.Scanner;

public class JavaFor5
{
	public static void main(String[] args)
	{
		int endNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Counter Program");
		System.out.println("This program will count from zero up to whatever number you enter.");
		System.out.println("Enter a number to count to: ");
		endNum = keyboard.nextInt();

		for (int i = 0; i <= endNum; i++)
		{
			System.out.println(i);
		}

	}
}