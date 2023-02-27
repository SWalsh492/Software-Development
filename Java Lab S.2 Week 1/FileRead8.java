import java.util.Scanner;
import java.io.*;

public class FileRead8
{
	public static void main(String[] args) throws IOException
	{
		String day1, day2, day3 = " ";
		float temp1, temp2, temp3;

		File myFile = new File("Temp.txt");
		Scanner inputFile = new Scanner(myFile);

		day1 = inputFile.next();
		temp1 = inputFile.nextFloat();
		System.out.println("Day 1 : " + day1 + " - Temp: " + temp1 + "\n");

		day2 = inputFile.next();
		temp2 = inputFile.nextFloat();
		System.out.println("Day 2 : " + day2 + " - Temp: " + temp2 + "\n");

		day3 = inputFile.next();
		temp3 = inputFile.nextFloat();
		System.out.println("Day 3 : " + day3 + " - Temp: " + temp3 + "\n");

		inputFile.close();

	}


}