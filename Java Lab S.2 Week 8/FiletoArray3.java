import java.util.Scanner;
import java.io.*;

public class FiletoArray3
{
	public static void main(String[] args) throws IOException
	{
		String filename = "weekly.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		Double[] weeklyTake = new Double[7];

		double total = 0;
		for(int i = 0; i < 7; i++)
		{
			weeklyTake[i] = inputFile.nextDouble();
			System.out.println("Take for day " + (i+1) + " was " + weeklyTake[i]);
			total += weeklyTake[i];
		}

		System.out.println("Total take for the week was: " + total);

		inputFile.close();

	}

}