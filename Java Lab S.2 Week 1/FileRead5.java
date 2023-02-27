import java.util.Scanner;
import java.io.*;

public class FileRead5
{
	public static void main(String[] args) throws IOException
	{
		String output = " ";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();

		File myFile = new File(filename + ".txt");
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			output = inputFile.nextLine();
			System.out.println(output);
		}

		inputFile.close();

	}


}