import java.util.Scanner;

public class Construct12
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String input;
		Die user = new Die(6);
		Die comp = new Die(6);

		int compValue = 0;
		int userValue = 0;

		do
		{
			System.out.println("Roll the dice? (y/n): ");
			input = kb.nextLine();

			if(input.equals("y"))
			{
				comp.roll();
				compValue += comp.getValue();
				user.roll();
				userValue += user.getValue();
				System.out.println("Points: " + userValue);
			}
		}while(input.equals("y") && userValue <= 21 && compValue <= 21);


		System.out.println("\nGame Over \n\nUser's Points: " + userValue + "\nComputer's Points: " + compValue);

		if(userValue > compValue && userValue <= 21)
		{
			System.out.println("The user wins!");
		}
		else if(userValue > 21)
		{
			System.out.println("You exceeded 21, computer wins!");
		}
		else if(compValue > 21)
		{
			System.out.println("The computer exceeded 21, you win!");
		}
		else
		{
			System.out.println("The computer wins!");
		}

	}
}