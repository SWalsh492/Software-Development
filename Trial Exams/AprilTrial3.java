import java.util.Scanner;
import java.io.*;

public class AprilTrial3
{
	public static void main(String[] args) throws IOException
	{
		String filename = "temperate.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		int[] tempArray = new int[365];

		int totalTemp = 0;
		for(int i = 0; i < 365; i++)
		{
			tempArray[i] = inputFile.nextInt();
			totalTemp += tempArray[i];
		}
		System.out.println("The average daily temperature was: " + (totalTemp/365) +" celcius");

		int quarterTemp = 0;
		int quarterEnd = 91;

		for(int q = 0; q < 4; q++)
		{
			for(int i = quarterEnd-91; i < quarterEnd; i++)
			{
				quarterTemp += tempArray[i];
			}
			System.out.println("The average temperature for Q" + (q+1) + " was: " + (quarterTemp/91) + " celcius");
			quarterTemp = 0;
			quarterEnd += 91;
		}


		/*
		int quarterTemp = 0;
		for(int i = 0; i < 91; i++)
		{
			quarterTemp += tempArray[i];
		}
		System.out.println("The average temperature for Q1 was: " + (quarterTemp/91) + " celcius");

		quarterTemp = 0;
		for(int i = 92; i < 182; i++)
		{
			quarterTemp += tempArray[i];
		}
		System.out.println("The average temperature for Q2 was: " + (quarterTemp/91) + " celcius");

		quarterTemp = 0;
		for(int i = 183; i < 273; i++)
		{
			quarterTemp += tempArray[i];
		}
		System.out.println("The average temperature for Q3 was: " + (quarterTemp/91) + " celcius");

		quarterTemp = 0;
		for(int i = 274; i < 365; i++)
		{
			quarterTemp += tempArray[i];
		}
		System.out.println("The average temperature for Q4 was: " + (quarterTemp/92) + " celcius");

		*/


		int highestTemp = tempArray[0];
		int day = 0;
		for(int i = 0; i < 365; i++)
		{
			if(tempArray[i] > highestTemp)
			{
				highestTemp = tempArray[i];
				day = i+1;
			}
		}
		System.out.printf("The day with the highest temperature was day %d, which was %d degrees celcius that day. \n", day, highestTemp);

		int lowestTemp = 12;
		for(int i = 0; i < 365; i++)
		{
			if(tempArray[i] < lowestTemp)
			{
				lowestTemp = tempArray[i];
				day = i+1;
			}
		}
		System.out.printf("The day with the lowest temperature was day %d, which had %d degrees celcius that day. \n", day, lowestTemp);


		inputFile.close();




	}
}