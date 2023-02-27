import java.io.*;

public class WriteToFile3
{
    public static void main(String[] args) throws IOException
 {

	 PrintWriter outputFile = new PrintWriter("What to do.txt");

	 outputFile.println("A computer will do what you tell it to do,\nbut that may be much different from what you had in mind.\nJoseph Weizenbaum");

	 outputFile.close();
 }
}