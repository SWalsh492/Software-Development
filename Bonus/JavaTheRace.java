import java.util.Scanner;

public class JavaTheRace
{
	public static void main(String[] args)
	{
		String run1name;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter runner 1 name: ");
		run1name = keyboard.nextLine();

		Int run1time;
		System.out.println("Enter runner 1 time: ");
		run1time = keyboard.nextInt();

		String run2name;
		System.out.println("Enter runner 2 name: ");
		run2name = keyboard.nextLine();

		Int run2time;
		System.out.println("Enter runner 2 time: ");
		run2time = keyboard.nextInt();

		String run3name;
		System.out.println("Enter runner 3 name: ");
		run3name = keyboard.nextLine();

		Int run3time;
		System.out.println("Enter runner 3 time: ");
		run3time = keyboard.nextInt();

		if(run1time > rum2time && run1time > run3time)
		{
			System.out.println(run1name + " was the winner!");
			if(run2time > run3time)
			{
				System.out.println(run2name + " was second!");
			}
		}

	}
}