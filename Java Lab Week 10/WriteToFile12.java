import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile12
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 String content;
	 int count = 1;
	 String num;
	 int number;


	 filename = JOptionPane.showInputDialog("Enter File Name: ");

	 int choice = JOptionPane.showConfirmDialog(null, "Would you like to overwrite existing file content?");

	 if(choice == 0)
	 {
		 PrintWriter outputFile = new PrintWriter(filename);

		 content = JOptionPane.showInputDialog("Enter File Content: ");
		 outputFile.println(content);

		 outputFile.close();


	 }
	 else if(choice == 1)
	 {
		 FileWriter fwriter = new FileWriter(filename, true);
		 PrintWriter outputFile = new PrintWriter(fwriter);

		 content = JOptionPane.showInputDialog("Enter File Content: ");
		 outputFile.println(content);

		 outputFile.close();
	 }
	 else
	 {
		 JOptionPane.showMessageDialog(null, "Nothing will change in this file");
	 }

 }
}