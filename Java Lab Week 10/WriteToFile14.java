import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile14
{
    public static void main(String[] args) throws IOException
 {
	 String filename;

	 filename = JOptionPane.showInputDialog("Enter File Name: ");
	 PrintWriter outputFile = new PrintWriter("Data/"+filename + ".txt");
	 JOptionPane.showMessageDialog(null, "File Write Complete");


	 outputFile.println("Hello World");

	 outputFile.close();
 }
}