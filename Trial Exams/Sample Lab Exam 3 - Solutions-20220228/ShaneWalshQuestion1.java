/* Shane Walsh, G00406694, 01/03/22 */
import java.util.Scanner;
import java.io.*;

public class ShaneWalshQuestion1
{
	public static void main(String[] args) throws IOException // required for java.io
	{

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		//Scanner instance
		File myFile = new File("Tuesday.txt");

		//Use Scanner to read from the file
	 	Scanner inputFile = new Scanner(myFile);

		//////////// READ AND OUTPUT ////////////
		String myVariable;

		for(int i = 0; i < 3; i++)
		{
			myVariable = inputFile.nextLine();
			System.out.println(myVariable);
		}

		////////////// CLOSE FILE //////////////
	    inputFile.close();

	}
}




