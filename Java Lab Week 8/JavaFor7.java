import java.util.Scanner;

public class JavaFor7
{
	public static void main(String[] args)
	{
		int num1;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num1 = keyboard.nextInt();

		for (int i = 0; i <= 100; i = i + num1)
		{
			System.out.println(i);

	}

	}
}