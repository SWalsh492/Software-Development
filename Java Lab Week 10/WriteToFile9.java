import java.io.*;

public class WriteToFile9
{
    public static void main(String[] args) throws IOException
 {

	 FileWriter fwriter = new FileWriter("MyFile.txt", true);
	 PrintWriter outputFile = new PrintWriter(fwriter);

	 outputFile.println("This is using filewriter!");

	 outputFile.close();
 }
}