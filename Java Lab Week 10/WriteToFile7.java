import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile7
{
    public static void main(String[] args) throws IOException
 {

	 PrintWriter outputFile = new PrintWriter("File7.txt");

	 String num;
	 int number;
	 num = JOptionPane.showInputDialog("How many lines of text in file? ");
	 number = Integer.parseInt(num);

	 for(int i=1; i <= number; i++)
	 {
		 outputFile.println("Hello World");
	 }

	 outputFile.close();
 }
}