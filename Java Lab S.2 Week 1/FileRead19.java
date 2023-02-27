import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;


public class FileRead19
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		String file1Content = "";
		String file2Content = "";

		filename = JOptionPane.showInputDialog("Enter first file to compare: ");

		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			file1Content = inputFile.nextLine() + "\n";
		}
		inputFile.close();


		filename = JOptionPane.showInputDialog("Enter second file to compare: ");

		myFile = new File(filename);
		inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			file2Content = inputFile.nextLine() + "\n";
		}
		inputFile.close();

		if(file1Content.equals(file2Content))
		{
			JOptionPane.showMessageDialog(null,"Files are identical");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Files are different");
		}
	}
}