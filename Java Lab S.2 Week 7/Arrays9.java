import java.util.Scanner;

public class Arrays9
{
	public static void main(String[] args)
	{
		double[] sales = new double[12];

		double total = 0;

		for(int i = 0; i < sales.length; i++)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter sales for month " + (i+1) + ":");
			sales[i] = kb.nextDouble();
			total += sales[i];
		}

		System.out.println("\nSales per month were as follows: ");

		for(int i = 0; i < sales.length; i++)
		{
			System.out.println("Month " + (i+1) + " is: " + sales[i]);
		}

		System.out.println("\nTotal sales for the year: " + total);
		System.out.println("\nAverage monthly sales for the year: " + (total/12));

	}
}