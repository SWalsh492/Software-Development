import java.util.Scanner;

public class JavaSC1
{
	public static void main(String[] args)
	{
		String firstName;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first name: ");
		firstName = keyboard.nextLine();

		String secondName;
		System.out.println("Enter second name: ");
		secondName = keyboard.nextLine();


		if(firstName.equalsIgnoreCase(secondName))
		{
			System.out.println("The names " + firstName + " and " + secondName + " match!");

		}
		else
		{
			System.out.println("The names " + firstName + " and " + secondName + " are different!");

		}
	}
}