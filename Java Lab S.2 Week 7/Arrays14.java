import java.util.Scanner;

public class Arrays14
{
	public static void main(String[] args)
	{

		Scanner kb = new Scanner(System.in);
		System.out.println("What size is the array: ");
		int input = kb.nextInt();

		int[] myArray = new int[input];

		for(int i = 0; i < myArray.length; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter array value for index " + i + ": ");
			myArray[i] = keyboard.nextInt();
		}

		System.out.println("\nArray entry complete. The array is as follows: ");

		int max = myArray[0];
		int min = myArray[1];
		int total = 0;

		for(int i = 0; i < myArray.length; i++)
		{
			total += myArray[i];
			if(myArray[i] > max)
			{
				max = myArray[i];
			}
			else if(myArray[i] < min)
			{
				min = myArray[i];
			}

			System.out.println(myArray[i]);
		}
		System.out.println("The biggest number is: " + max);
		System.out.println("The smallest number is: " + min);
		System.out.println("The average input is: " + (total/input));

	}
}