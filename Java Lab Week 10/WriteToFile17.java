import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;


public class WriteToFile17
{
    public static void main(String[] args) throws IOException
 {
	 String filename;
	 int num1;

	 Random randomNumber = new Random();
	 num1 = randomNumber.nextInt(9999)+1000;
	 filename = ("A" +num1);

	 PrintWriter outputFile = new PrintWriter(filename + ".txt");

	 System.out.println("The name of this file is "+ filename + ".txt");

	 outputFile.close();
 }
}