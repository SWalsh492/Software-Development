import java.util.Scanner;

public class JavaFor9
{
	public static void main(String[] args)
	{
		int start;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number to start: ");
		start = keyboard.nextInt();

		int finish;
		System.out.print("Enter a number to finish: ");
		finish = keyboard.nextInt();

		for (int i = start; i <= finish; i++)
		{
			System.out.println(i);

	}

	}
}