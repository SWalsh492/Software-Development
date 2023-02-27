import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile11
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 String content;
	 int count = 1;
	 String num;
	 int number;
	 String history = " ";

	 filename = JOptionPane.showInputDialog("Enter File Name: ");
	 FileWriter fwriter = new FileWriter(filename, true);
	 PrintWriter outputFile = new PrintWriter(fwriter);

	 num = JOptionPane.showInputDialog("How many lines of text would you like to add? ");
	 number = Integer.parseInt(num);

	 for(int i=1; i <= number; i++)
	 	 {
			 content = JOptionPane.showInputDialog("Enter file Content for line " + count);
			 history = (history + content + "\n");
			 outputFile.println(content);
			 count++;

		}


	 outputFile.close();
 }
}