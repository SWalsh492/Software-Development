import java.util.Scanner;

public class JavaFor6
{
	public static void main(String[] args)
	{
		int multiple;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Multiplication Timetable");
		System.out.println("Enter a number to generate multiplication tables for: ");
		multiple = keyboard.nextInt();

		for (int i = 1; i <= 10; i++)
		{
			System.out.println(multiple + " times " + i + " is " + (multiple*i));
		}

	}
}