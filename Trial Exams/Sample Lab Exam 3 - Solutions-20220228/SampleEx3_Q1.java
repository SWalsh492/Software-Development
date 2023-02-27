import java.util.Scanner;
import java.io.*;

public class SampleEx3_Q1
{
	public static void main(String[] args) throws IOException // required for java.io
	{

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the filename.
		System.out.print("Enter the filename: ");
		String filename = keyboard.nextLine();

		//Scanner instance
		File myFile = new File(filename);

		//Use Scanner to read from the file
	 	Scanner inputFile = new Scanner(myFile);

		//////////// READ AND OUTPUT ////////////
		String myVariable;

		while(inputFile.hasNext())
		{
			myVariable = inputFile.nextLine();
			System.out.println(myVariable);
		}

		////////////// CLOSE FILE //////////////
	    inputFile.close();

	}
}





