import java.util.Scanner;

public class JavaForBonus2
{
	public static void main(String[] args)
	{
		int width;
		int height;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter width of rectangle: ");
		width = keyboard.nextInt();

		System.out.print("Enter height of rectangle: ");
		height = keyboard.nextInt();

		for (int i = 1; i <= height; i++)
		{
			for (int x = 1; x <= width; x++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}