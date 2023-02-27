import java.util.Scanner;

public class JavaSwitch3
{
	public static void main(String[] args)
	{
		int num1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number: ");
		num1 = keyboard.nextInt();
		keyboard.close();
		switch(num1)
		{
			case 1:
				System.out.println("Today is Monday");
				break;

			case 2:
				System.out.println("Today is Tuesday");
				break;

			case 3:
				System.out.println("Today is Wednesday");
				break;

			case 4:
				System.out.println("Today is Thursday");
				break;

			case 5:
				System.out.println("Today is Friday");
				break;

			case 6:
				System.out.println("Today is Saturday");
				break;

			case 7:
				System.out.println("Today is Sunday");
				break;

			default:
				System.out.println("Value entered is not valid!");



		}

	}
}