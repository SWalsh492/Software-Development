import java.util.Scanner;
import java.io.*;

public class FileRead16
{
	public static void main(String[] args) throws IOException
	{
		String firstName = " ";
		String lastName = " ";
		int age = 0;

		String history = " ";

		File myFile = new File("dataInMulti.txt");
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			firstName = inputFile.next();
			lastName = inputFile.next();
			age = 2022 - inputFile.nextInt();

			history = (history + "Name: " + lastName + ", "+ firstName + " - Age: " + age + "\n");
		}

		inputFile.close();

		PrintWriter outputFile = new PrintWriter("dataInMulti.txt");
		outputFile.println(history);
		System.out.println(history);
		outputFile.close();


	}


}