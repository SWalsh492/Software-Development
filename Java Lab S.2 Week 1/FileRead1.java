import java.util.Scanner;
import java.io.*;

public class FileRead1
{
	public static void main(String[] args) throws IOException
	{
		File myFile = new File("Quotes.txt");

		Scanner inputFile = new Scanner(myFile);

		String myVariable = inputFile.nextLine();
		System.out.println(myVariable);

		myVariable = inputFile.nextLine();
		System.out.println(myVariable);

		myVariable = inputFile.nextLine();
		System.out.println(myVariable);

		inputFile.close();

	}


}