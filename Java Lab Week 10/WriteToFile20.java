import java.io.*;
import javax.swing.JOptionPane;


public class WriteToFile20
{
    public static void main(String[] args) throws IOException
 {
	 String number;
	 int numOfFiles;


	 do
	 {
		 number = JOptionPane.showInputDialog("How many files would you like to create? \nEnter value between 1 and 10: ");
		 numOfFiles = Integer.parseInt(number);

		 for(int i = 1; i <= numOfFiles; i++)
		 {
			 PrintWriter outputFile = new PrintWriter("Ex.20/Ex20_File" + i +".txt");
			 outputFile.println("This is a file number " + i);
			 outputFile.close();

		}

		 JOptionPane.showMessageDialog(null, "Complete\n" + numOfFiles + " files created! :)");




	}while(numOfFiles <=1 || numOfFiles >=10);
 }
}