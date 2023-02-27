import java.util.Scanner;
import java.io.*;

public class FileRead10
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();
		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);

		int lines = 0;

		while(inputFile.hasNext())
		{
			inputFile.nextLine();
			lines++;
		}

		System.out.println("This file has " + lines + " lines of text.");


		inputFile.close();

	}
}