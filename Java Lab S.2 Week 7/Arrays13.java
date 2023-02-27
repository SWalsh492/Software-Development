import java.util.Scanner;

public class Arrays13
{
	public static void main(String[] args)
	{

		int[] numbers = {2, 4, 6, 23, 67, 75, 45, 67, 78, 65, 45, 45, 43, 98, 9, 8, 9, 12};

		int max = numbers[0];
		int min = numbers[6];

		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
			else if(numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		System.out.println("The biggest number is: " + max);
		System.out.println("The smallest number is: " + min);


	}
}