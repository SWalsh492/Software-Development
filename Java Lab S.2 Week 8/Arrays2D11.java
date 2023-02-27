import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Arrays2D11
{
	public static void main(String[] args) throws IOException
	{
		String filename = "numbers.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		int[] numList = new int[40];

		for(int i = 0; i < numList.length; i++)
		{
			numList[i] = inputFile.nextInt();
		}

		int highestNum = numList[0];
		int index = 0;
		for(int i = 0; i < numList.length; i++)
		{
			if(numList[i] > highestNum)
			{
				highestNum = numList[i];
				index = i;
			}
		}
		System.out.printf("Highest value is: %d and is at index %d.\n", highestNum, index);

		int	lowestNum = numList[5];
		index = 0;
		for(int i = 0; i < numList.length; i++)
		{
			if(numList[i] < lowestNum)
			{
				lowestNum = numList[i];
				index = i;
			}
		}
		System.out.printf("Lowest value is: %d and is at index %d.\n", lowestNum, index);

		System.out.println("The difference between the highest and the lowest values is : " + (highestNum - lowestNum));

		Arrays.sort(numList);

		Scanner kb = new Scanner(System.in);
		System.out.print("Output array in order or in reverse (enter o or r): ");

		switch(kb.nextLine())
		{
			case "o":
				for(int i = 0; i < 40; i++)
				{
					System.out.println(numList[i]);
				}
				break;
			case "r":
				for(int i = 39; i > 0; i--)
				{
					System.out.println(numList[i]);
				}
				break;
		}

		System.out.println("\nOutputting every 5th value\n");
		for(int i = 0; i < 40; i+=5)
		{
			System.out.println(numList[i]);
		}

		System.out.println("-- Array Output --");
		System.out.print("Specify output starting at index: ");
		index = kb.nextInt();
		System.out.print("Specify how many elements should be output: ");
		int howMany = kb.nextInt();

		for(int i = index; i < (index+howMany); i++)
		{
			System.out.println("Index: " + index + " Value: " + numList[i]);
		}

		inputFile.close();

	}
}