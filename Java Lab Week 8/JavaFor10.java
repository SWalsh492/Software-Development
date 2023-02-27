import java.util.Scanner;

public class JavaFor10
{
	public static void main(String[] args)
	{
		int start;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number to start: ");
		start = keyboard.nextInt();

		for (int i = start; i <= start+25; i++)
		{
			System.out.println(i);

	}

	}
}