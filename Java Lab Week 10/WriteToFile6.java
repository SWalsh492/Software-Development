import java.io.*;

public class WriteToFile6
{
    public static void main(String[] args) throws IOException
 {

	 PrintWriter outputFile = new PrintWriter("File6.txt");

	 for(int i=1; i <=10 ; i++)
	 {
		 outputFile.println("This is java!");
	 }

	 outputFile.close();
 }
}