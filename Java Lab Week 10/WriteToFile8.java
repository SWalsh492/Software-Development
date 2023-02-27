import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile8
{
    public static void main(String[] args) throws IOException
 {

	 PrintWriter outputFile = new PrintWriter("File8.txt");

	 String num;
	 int number;
	 String content;
	 num = JOptionPane.showInputDialog("How many lines of text in file? ");
	 number = Integer.parseInt(num);
	 content = JOptionPane.showInputDialog("What would you like to output?: ");



	 for(int i=1; i <= number; i++)
	 {
		 outputFile.println(content);
	 }

	 outputFile.close();
 }
}