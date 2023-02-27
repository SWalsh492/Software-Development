import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile10
{
    public static void main(String[] args) throws IOException
 {
	 String content;
	 FileWriter fwriter = new FileWriter("MyFile.txt", true);
	 PrintWriter outputFile = new PrintWriter(fwriter);
	 content = JOptionPane.showInputDialog("Enter line of text to add to file: ");

	 outputFile.println(content);

	 outputFile.close();
 }
}