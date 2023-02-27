import java.util.Scanner;


public class conversion
{
	public static void main(String[] args)
	{
		String input;
		int selection;
		double distance;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a distance in meters: ");
		distance = keyboard.nextDouble();

		if(distance < 0)
		{
			System.out.print("No negative entries aloud!\nEnter a distance in meters: ");
			distance = keyboard.nextDouble();
		}

		do
		{
			menu();

			System.out.print("\nEnter your choice: ");
			selection = keyboard.nextInt();

			while (selection < 1 || selection > 4)
			{
				System.out.println("Invalid selection. Enter your choice: ");
				selection = keyboard.nextInt();
			}

			switch(selection)
			{
				case 1:
					showKilometers(distance);
					break;
				case 2:
					showInches(distance);
					break;
				case 3:
					showFeet(distance);
					break;
				case 4:
					System.out.println("Bye!");
			}


			System.out.println();

		} while (selection != 4);
	}

	public static void menu()
	{
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}

	public static void showKilometers(double meters)
	{
		double kilometers = meters*0.001;
		System.out.println(meters + " meters is " + kilometers + " kilometers.");
	}

	public static void showInches(double meters)
	{
		double inches = meters*39.37;
		System.out.println(meters + " meters is " + inches + " inches.");
	}

	public static void showFeet(double meters)
	{
		double feet = meters*3.281;
		System.out.println(meters + " meters is " + feet + " feet.");
	}

}