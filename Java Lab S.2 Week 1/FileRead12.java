import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;


public class FileRead12
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		filename = JOptionPane.showInputDialog("Enter the filename: ");

		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);

		int words = 0;

		while(inputFile.hasNext())
		{
			inputFile.next();
			words++;
		}

		JOptionPane.showMessageDialog(null,"This file has " + words + " words.");


		inputFile.close();

	}
}