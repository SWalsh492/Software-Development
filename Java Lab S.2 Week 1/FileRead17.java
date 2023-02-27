import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;


public class FileRead17
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		String fileContent = "";
		filename = JOptionPane.showInputDialog("Enter name of file to copy: ");

		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			fileContent = fileContent + inputFile.nextLine() + "\n";
		}

		inputFile.close();

		PrintWriter outputFile = new PrintWriter(filename + " - COPY");
		outputFile.println(fileContent);
		outputFile.close();


		JOptionPane.showMessageDialog(null,"FILE COPY COMPLETE!");


	}
}