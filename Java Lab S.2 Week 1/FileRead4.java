import java.util.Scanner;
import java.io.*;

public class FileRead4
{
	public static void main(String[] args) throws IOException
	{
		String myVariable = " ";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();

		File myFile = new File(filename + ".txt");
		Scanner inputFile = new Scanner(myFile);

		myVariable = inputFile.nextLine();
		System.out.println(myVariable);


		inputFile.close();

	}


}