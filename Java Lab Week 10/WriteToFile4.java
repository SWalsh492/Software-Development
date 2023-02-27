import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile4
{
    public static void main(String[] args) throws IOException
 {
	 String filename;

	 filename = JOptionPane.showInputDialog("Enter File Name: ");

	 PrintWriter outputFile = new PrintWriter(filename);

	 outputFile.println("This is Java!");

	 outputFile.close();
 }
}