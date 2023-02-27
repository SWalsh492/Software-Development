import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;


public class FileRead18
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		String file1Content = "";
		String file2Content = "";

		filename = JOptionPane.showInputDialog("Enter first file to merge: ");

		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			file1Content = file1Content + inputFile.nextLine() + "\n";
		}
		inputFile.close();



		filename = JOptionPane.showInputDialog("Enter second file to merge: ");

		myFile = new File(filename);
		inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			file2Content = file2Content + inputFile.nextLine() + "\n";
		}
		inputFile.close();



		PrintWriter outputFile = new PrintWriter("merged.txt");
		outputFile.println(file1Content + "\n");
		outputFile.println(file2Content);
		outputFile.close();

	}
}