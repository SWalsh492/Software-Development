import java.io.*;
import java.util.Scanner;

public class DetectVowels
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the string: ");
		String input = keyboard.nextLine();

		System.out.println("Number of Vowels in the String: " + detectVowels(input));

	}

	public static int detectVowels(String parameter)
	{
		int numOfVowels = 0;
		for(int i = 0; i < parameter.length(); i++)
		{
			if(parameter.charAt(i) == 'a' || parameter.charAt(i) == 'e' || parameter.charAt(i) == 'i' || parameter.charAt(i) == 'o' || parameter.charAt(i) == 'u')
			{
				numOfVowels++;
			}
		}

		return numOfVowels;
	}

}