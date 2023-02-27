import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;


public class WriteToFile18
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 int num1;
	 int choice;

	 Random randomNumber = new Random();
	 num1 = randomNumber.nextInt(5500)+500;

	 choice = randomNumber.nextInt(3)+1;

	 if(choice==1)
	 {
		 filename = ("R-" +num1);
	 }
	 else if(choice==2)
	 {
		 filename = ("S-" + num1);
	 }
	 else
	 {
		 filename = ("T-" + num1);
	 }



	 PrintWriter outputFile = new PrintWriter(filename + ".txt");

	 System.out.println("The name of this file is "+ filename+".txt");

	 outputFile.close();
 }
}