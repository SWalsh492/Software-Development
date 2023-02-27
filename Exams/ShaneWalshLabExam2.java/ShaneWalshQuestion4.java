// Shane Walsh, G00406694, 14/12/21

import javax.swing.JOptionPane;
import java.io.*;

public class ShaneWalshQuestion4
{
	public static void main(String[] args) throws IOException
	{
		// Declaration of my variables
		String fileName;
		int overwriteOrAppend;
		int numOfLines;
		String content;

		// Prompt user to enter file name and asks user whether to overwrite or append chosen file
		fileName = JOptionPane.showInputDialog(null, "Enter a file name: ");

		overwriteOrAppend = JOptionPane.showConfirmDialog(null, "Do you want to overwrite the file? \n(Click YES to overwrite, NO to append)");

		if(overwriteOrAppend == 1)
		{
			// Creates file to append to. Prompts user for number of lines and to enter line content
			FileWriter fwriter = new FileWriter("LabExam/" + fileName + ".txt", true);
			PrintWriter outputFile = new PrintWriter(fwriter);

			String input = JOptionPane.showInputDialog(null, "How many lines of text would you like to add? ");
			numOfLines = Integer.parseInt(input);

			for(int i = 1; i <= numOfLines; i++)
			{
				content = JOptionPane.showInputDialog(null, "Enter content for line " + i + ": ");
				outputFile.println(content);
			}

			outputFile.close();
		}
		else
		{
			// Creates file which will overwrite. Prompts user for number of lines and to enter line content
			PrintWriter outputFile = new PrintWriter("LabExam/" + fileName + ".txt");

			String input = JOptionPane.showInputDialog(null, "How many lines of text would you like to add? ");
			numOfLines = Integer.parseInt(input);

			for(int i = 1; i <= numOfLines; i++)
			{
				content = JOptionPane.showInputDialog(null, "Enter content for line " + i + ": ");
				outputFile.println(content);
			}

			outputFile.close();
		}

		JOptionPane.showMessageDialog(null, "Program complete.");
	}
}