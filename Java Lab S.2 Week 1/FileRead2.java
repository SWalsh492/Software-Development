import java.util.Scanner;
import java.io.*;

public class FileRead2
{
	public static void main(String[] args) throws IOException
	{
		File myFile = new File("Quotes.txt");

		Scanner inputFile = new Scanner(myFile);

		for(int i = 1; i <=3; i++)
		{
			String myVariable = inputFile.nextLine();
			System.out.println(i + ": " + myVariable);
		}

		inputFile.close();

	}


}