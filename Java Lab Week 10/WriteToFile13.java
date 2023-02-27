import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile13
{
    public static void main(String[] args) throws IOException
 {

	 String filename;
	 String num;
	 int count = 0;
	 int start;
	 int end;

	 filename = JOptionPane.showInputDialog("Enter File Name: ");
	 PrintWriter outputFile = new PrintWriter(filename);


	 num = JOptionPane.showInputDialog("Start count from: ");
	 start = Integer.parseInt(num);

	 num = JOptionPane.showInputDialog("Finish count at: ");
	 end = Integer.parseInt(num);

	 int choice = JOptionPane.showConfirmDialog(null, "Output to screen");

	 if(choice == 0)
	 {
		 System.out.println("Count: " + count);
		 for(count=start; count <= end; count++)
		 	 {
		 		 outputFile.println("Count: " + count);
		 	 }

	 }else
	 {
		 for(count=start; count <= end; count++)
		 {
			 outputFile.println("Count: " + count);
		}

	 }
	 outputFile.close();
 }
}