import java.util.Scanner;
import java.io.*;



public class methodsException1
{
	public static void main(String[] args) throws IOException
	{
		String myvar;
		myvar = fileRead(0, "months.txt");

	}

	public static String fileRead(int parameter, String filename) throws IOException
	{
		String lineRead = " ";
		if(parameter == 0)
		{
			File myFile = new File(filename);

			Scanner inputFile = new Scanner(myFile);
			for(int i = 1; i <= 12; i++)
			{
				lineRead = inputFile.nextLine();
				System.out.println(lineRead);
			}
		}
		else if(parameter > 12)
		{
			System.out.println("FILE READ ERROR: There are only 12 lines of text in this file");
		}
		else
		{
			File myFile = new File(filename);

			Scanner inputFile = new Scanner(myFile);
			for(int i = 1; i <= parameter; i++)
			{
				lineRead = inputFile.nextLine();
			}

	}
	return(lineRead);

	}

}