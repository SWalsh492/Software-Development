import java.util.Scanner;

public class AprilTrial1
{
	public static void main(String[] args)
	{
		// Use scanner to allow user to define size of array

		Scanner kb = new Scanner(System.in);
		System.out.print("Define array size: ");
		int[] array1 = new int[kb.nextInt()];

		// Ask user to input values for the array, given to their selected size

		for(int i = 0; i < array1.length; i++)
		{
			System.out.print("Enter array value for index " + i + ": ");
			array1[i] = kb.nextInt();
		}

		// Outputs the array for viewing
		System.out.println("\n\nArray has been created. The array is as follows: ");
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println(array1[i]);
		}


	}
}