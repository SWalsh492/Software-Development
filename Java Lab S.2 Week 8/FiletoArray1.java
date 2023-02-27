import java.util.Scanner;
import java.io.*;

public class FiletoArray1
{
	public static void main(String[] args) throws IOException
	{
		String filename = "numbers.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		int[] nums = new int[5];

		for(int i = 0; i < 5; i++)
		{
			nums[i] = inputFile.nextInt();
			System.out.println(nums[i]);
		}

		inputFile.close();

	}

}