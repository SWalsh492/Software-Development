import java.util.Scanner;
import java.io.*;

public class FileRead7
{
	public static void main(String[] args) throws IOException
	{
		double output = 0;
		double total = 0;
		File myFile = new File("Add_Double.txt");
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			output = inputFile.nextDouble();
			System.out.println(output);
			total = total+output;
		}

		System.out.println("TOTAL OF ALL NUMBERS IN FILE IS: "+total);

		inputFile.close();

	}


}