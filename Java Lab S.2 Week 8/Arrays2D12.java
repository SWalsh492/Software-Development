import java.util.Scanner;
import java.io.*;

public class Arrays2D12
{
	public static void main(String[] args) throws IOException
	{
		String filename = "capitals.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		String[] capitals = new String[196];

		for(int i = 0; i < capitals.length; i++)
		{
			capitals[i] = inputFile.nextLine();
		}

		filename = "countries.txt";
		file = new File(filename);
		inputFile = new Scanner(file);

		String[] countries = new String[196];

		for(int i = 0; i < countries.length; i++)
		{
			countries[i] = inputFile.nextLine();
		}

		boolean carryOn = true;
		String country;
		do
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter 1 to search by country or 2 to search by capital. Enter 0 to end program: ");

			switch(kb.nextInt())
			{
				case 0:
					carryOn = false;
					break;

				case 1:
					System.out.println("Enter country name: ");
					country = kb.nextLine();
					System.out.println();
			}


		}while(carryOn == true);

	}
}