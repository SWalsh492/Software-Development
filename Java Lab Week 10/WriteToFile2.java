import java.io.*;

public class WriteToFile2
{
    public static void main(String[] args) throws IOException
 {

	 PrintWriter outputFile = new PrintWriter("ComputingQuote.txt");

	 outputFile.println("The Internet?");
	 outputFile.println("We are not interested in it.");
	 outputFile.println("Bill Gates, 1993.");


	 outputFile.close();
 }
}