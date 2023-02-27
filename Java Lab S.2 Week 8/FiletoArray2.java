import java.util.Scanner;
import java.io.*;

public class FiletoArray2
{
	public static void main(String[] args) throws IOException
	{
		String filename = "myfile.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		String[] namesList = new String[26];

		for(int i = 0; i < 26; i++)
		{
			namesList[i] = inputFile.nextLine();
			System.out.println(namesList[i]);
		}

		inputFile.close();

	}

}