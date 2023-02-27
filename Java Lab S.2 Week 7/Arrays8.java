import java.util.Scanner;

public class Arrays8
{
	public static void main(String[] args)
	{
		String[] names = new String[5];

		for(int i = 0; i < names.length; i++)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter name " + i + ":");
			names[i] = kb.nextLine();
		}

		System.out.println("\nNames entered are as follows: ");

		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Index " + i + " is: " + names[i]);
		}

		System.out.println("\nLength of array is: " + names.length);

	}
}