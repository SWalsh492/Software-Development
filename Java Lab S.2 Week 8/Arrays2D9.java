import java.util.Scanner;
import java.io.*;

public class Arrays2D9
{
	public static void main(String[] args) throws IOException
	{
		String filename = "people.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		String[] names = new String[1];
		int[] idNum = new int[1];
		double[] total = new double[1];

		int i = 0;
		while(inputFile.hasNext())
		{
			names[i] = inputFile.nextLine();
			idNum[i] = inputFile.nextInt();
			total[i] = inputFile.nextDouble();
			i++;
		}

		inputFile.close();

		for(i = 0; i < 1; i++)
		{
			System.out.println("---------------");
			System.out.println("Name: " + names[i]);
			System.out.println("ID: " + idNum[i]);
			System.out.println("Total: " + total[i]);
		}
	}
}