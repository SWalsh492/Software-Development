import java.util.Scanner;
import java.io.*;

public class FiletoArray4
{
	public static void main(String[] args) throws IOException
	{
		String filename = "rainfall.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		Double[] rainfall = new Double[365];

		double total = 0;
		for(int i = 0; i < 365; i++)
		{
			rainfall[i] = inputFile.nextDouble();
			System.out.println("Rainfall for day " + (i+1) + " was " + rainfall[i]);
			total += rainfall[i];
		}

		System.out.printf("Total rainfall for the year was: %.2f \n", total);
		System.out.printf("Average daily rainfall was: %.2f \n", (total/365));
		System.out.printf("Average weekly rainfall was: %.2f \n", (total/52));
		System.out.printf("Average monthly rainfall was: %.2f \n", (total/12));

		double highestRain = rainfall[0];
		int day = 0;
		for(int i = 0; i < 365; i++)
		{
			if(rainfall[i] > highestRain)
			{
				highestRain = rainfall[i];
				day = i+1;
			}
		}
		System.out.printf("The day with the highest rainfall was day %d, which had %.2fmm of rainfall that day. \n", day, highestRain);

		double lowestRain = 45.6;
		for(int i = 0; i < 365; i++)
		{
			if(rainfall[i] < lowestRain)
			{
				lowestRain = rainfall[i];
				day = i+1;
			}
		}
		System.out.printf("The day with the lowest rainfall was day %d, which had %.2fmm of rainfall that day. \n", day, lowestRain);


		inputFile.close();

	}

}