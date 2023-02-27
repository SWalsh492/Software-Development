import java.util.Scanner;
import java.io.*;

public class FileRead15
{
	public static void main(String[] args) throws IOException
	{

		File myFile = new File("datain.txt");
		Scanner inputFile = new Scanner(myFile);

		String firstName = inputFile.next();
		String lastName = inputFile.next();
		int age = 2022 - inputFile.nextInt();

		inputFile.close();

		PrintWriter outputFile = new PrintWriter("datain.txt");
		outputFile.printf("Name: %s,%s - Age: %d", lastName, firstName, age);
		outputFile.close();

	}


}