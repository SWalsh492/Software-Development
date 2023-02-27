import java.util.Scanner;
import java.io.*;

public class FileRead9
{
	public static void main(String[] args) throws IOException
	{
		String firstName, lastName = " ";
		float salary;
		float raise;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();

		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);
		System.out.println("FILE OPENED IS: " + filename);

		while(inputFile.hasNext())
		{
			lastName = inputFile.next();
			firstName = inputFile.next();
			salary = inputFile.nextFloat();
			raise = (inputFile.nextFloat() / 100*salary);
			System.out.println(firstName + " " + lastName + " - RAISE WILL BE: " + raise + "\n" + "-------------- \n");
		}

		inputFile.close();

	}


}