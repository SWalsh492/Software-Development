import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile5
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 String content;

	 filename = JOptionPane.showInputDialog("Enter File Name: ");
	 content = JOptionPane.showInputDialog("Enter File Content: ");


	 PrintWriter outputFile = new PrintWriter(filename);

	 outputFile.println(content);

	 outputFile.close();
 }
}