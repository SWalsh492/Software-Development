// Shane Walsh, G00406694, 26/04/2022

import java.util.Scanner;
import java.io.*;

public class ShaneWalshQuestion1
{
	public static void main(String[] args) throws IOException
	{
		// Prompts user for filename and reads chosen files content
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String filename = kb.nextLine();
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		// Stores entire file onto a string array
		String[] wordArray = new String[1000];

		for(int i = 0; i < 1000; i++)
		{
			wordArray[i] = inputFile.nextLine();
		}

		// Outputs the last 10 elements of the array
		System.out.println("Outputting the last 10 lines of the array");
		for(int i = 990; i < 1000; i++)
		{
			System.out.println(wordArray[i]);
		}
	}
}