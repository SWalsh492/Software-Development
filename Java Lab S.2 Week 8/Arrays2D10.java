import java.util.Scanner;
import java.io.*;

public class Arrays2D10
{
	public static void main(String[] args) throws IOException
	{
		String filename = "banking.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		String[] names = new String[5];
		int[] accountNumber = new int[5];
		double[] current = new double[5];

		int i = 0;
		while(inputFile.hasNext())
		{
			names[i] = inputFile.next();
			accountNumber[i] = inputFile.nextInt();
			current[i] = inputFile.nextDouble();
			i++;
		}

		for(int p = 0; p < 5; p++)
		{
			System.out.println("------------");
			System.out.println("Name: " + names[p]);
			System.out.println("ID: " + accountNumber[p]);
			System.out.println("Total: " + current[p] + "\n");
		}

		inputFile.close();

		Scanner kb = new Scanner(System.in);
		System.out.print("Select user? (0 to 4): ");
		int input = kb.nextInt();


		System.out.println("------------");
		System.out.println("Name: " + names[input]);
		System.out.println("ID: " + accountNumber[input]);
		System.out.println("Total: " + current[input] + "\n");






	}
}