import java.util.Scanner;

public class Arrays7
{
	public static void main(String[] args)
	{
		int[] ex7Array = new int[5];

		for(int i = 0; i < ex7Array.length; i++)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter value " + i + ":");
			ex7Array[i] = kb.nextInt();
		}

		System.out.println("\nValues entered are as follows: ");

		for(int i = 0; i < ex7Array.length; i++)
		{
			System.out.println("Index " + i + " value is: " + ex7Array[i]);
		}

		System.out.println("\nLength of array is: " + ex7Array.length);

	}
}