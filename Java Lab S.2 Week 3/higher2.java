import java.util.Scanner;


public class higher2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num1 = keyboard.nextInt();

		System.out.println("Enter an integer: ");
		int num2 = keyboard.nextInt();

		higher(num1,num2);

	}

	public static void higher(int x, int y)
	{
		if(x > y)
		{
			System.out.println(x + " is greater than " + y);
		}
		else if(y > x)
		{
			System.out.println(y + " is greater than " + x);
		}
		else
		{
			System.out.println("Numbers are equal");
		}
	}

}