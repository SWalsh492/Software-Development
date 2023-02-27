import java.util.Scanner;

// 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


public class Arrays10
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("How many names do you wish to enter?: ");
		int input = kb.nextInt();

		String[] list = new String[input];

		for(int i = 0; i < list.length; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter name for index " + i + ": ");
			list[i] = keyboard.nextLine();
		}

		System.out.println("\nNAMES ENTERED: ");

		for(int i = 0; i < list.length; i++)
		{
			System.out.println("Name Index " + i + " " + list[i]);
		}

		do
		{
			Scanner kb2 = new Scanner(System.in);
			System.out.println("Amend name entered? (Enter index to change or enter minus 1 to end): ");
			input = kb2.nextInt();
			if(input == -1)
			{
				System.out.println("Changes complete");
			}
			else
			{
				System.out.println("Current name at index " + input + " is: " + list[input]);
				System.out.print("Enter new value: ");
				list[input] = kb2.nextLine();
				list[input] = kb2.nextLine();

			}
		}while (input != -1);

		System.out.println("\nNAMES ENTERED: ");

		for(int i = 0; i < list.length; i++)
		{
			System.out.println("Name Index " + i + " " + list[i]);
		}

		kb.close();
	}
}