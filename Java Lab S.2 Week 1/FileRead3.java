import java.util.Scanner;
import java.io.*;

public class FileRead3
{
	public static void main(String[] args) throws IOException
	{
		File myFile = new File("Quotes.txt");

		Scanner inputFile = new Scanner(myFile);
		String myVariable = " ";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Output which line? ");
		int lineNum = keyboard.nextInt();

		for(int i = 1; i <= lineNum; i++)
		{
			myVariable = inputFile.nextLine();

		}

		System.out.println(myVariable);


		inputFile.close();

	}


}