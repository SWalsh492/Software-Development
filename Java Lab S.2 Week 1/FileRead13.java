
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;


public class FileRead13
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		filename = JOptionPane.showInputDialog("Enter the filename: ");

		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);

		int num1;
		String message = " ";

		Random randomNumber = new Random();
		num1 = randomNumber.nextInt(1900)+1;

		for(int i = 0; i < num1; i++)
		{
			message = inputFile.nextLine();
		}


		JOptionPane.showMessageDialog(null,"Random quote of the Day\n \n" + message);


		inputFile.close();

	}
}