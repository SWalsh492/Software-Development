import java.util.Scanner;
import java.io.*;

public class FileRead6
{
	public static void main(String[] args) throws IOException
	{
		int output = 0;
		int total = 0;
		File myFile = new File("Add_int.txt");
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			output = inputFile.nextInt();
			System.out.println(output);
			total = total+output;
		}

		System.out.println("TOTAL OF ALL NUMBERS IN FILE IS: "+total);

		inputFile.close();

	}


}