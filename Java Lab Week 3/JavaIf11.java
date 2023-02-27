import java.util.Scanner;

public class JavaIf11
{
	public static void main(String[] args)
	{
		int dayNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter day number: ");
		dayNum = keyboard.nextInt();

		if(dayNum == 1)
		{
			System.out.println("Monday");

		}
		if(dayNum == 2)
		{
			System.out.println("Tuesday");

		}
		if(dayNum == 3)
		{
			System.out.println("Wednesday");

		}
		if(dayNum == 4)
		{
			System.out.println("Thursday");

		}
		if(dayNum == 5)
		{
			System.out.println("Friday");

		}
		if(dayNum == 6)
		{
			System.out.println("Saturday");

		}
		if(dayNum == 7)
		{
			System.out.println("Sunday");

		}




	}
}