/*
Name: Shane Walsh,
Student ID: G00406694,
Date: 01/03/22
*/

import java.util.Scanner;
import java.io.*;

public class ShaneWalshQuestion1
{
	public static void main(String[] args) throws IOException
	{
		// Create instance of myFile and read from the file
		File myFile = new File("Tuesday.txt");

	 	Scanner inputFile = new Scanner(myFile);

		// Output using for loop
		for(int i = 0; i < 3; i++)
		{
			System.out.println(inputFile.nextLine());
		}

		// Close File
	    inputFile.close();
	}
}




