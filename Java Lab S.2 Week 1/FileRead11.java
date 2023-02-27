import java.util.Scanner;
import java.io.*;

public class FileRead11
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();

		File myFile = new File(filename);

		if(!myFile.exists())
		{
			System.out.println("No such file, exiting program.");
		}
		else
		{
			Scanner inputFile = new Scanner(myFile);
			System.out.println("File exists, outputting first line from file.");
			System.out.println(inputFile.nextLine());
			inputFile.close();

		}

	}
}