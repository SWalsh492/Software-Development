// Shane Walsh, G00406694, 26/04/2022

import java.util.Scanner;

public class ShaneWalshQuestion2
{
	public static void main(String[] args)
	{
		// Creates array for number of customers over a week and prompts user for daily number of customers
		int[] customersDaily = new int[7];
		int customersTotal = 0;
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < 7; i++)
		{
			System.out.print("Enter number of customers for day " + (i+1) + ": ");
			customersDaily[i] = kb.nextInt();
			customersTotal += customersDaily[i];
		}

		// Outputs total number of customers and the day with the most customers
		System.out.println("\nTotal customers for the week was " + customersTotal);
		int mostCustomers = customersDaily[0];
		int day = 0;
		for(int i = 0; i < 7; i++)
		{
			if(customersDaily[i] > mostCustomers)
			{
				mostCustomers = customersDaily[i];
				day = i+1;
			}
		}
		System.out.printf("\nThe day with the most customers was day %d, which had %d customers. \n\n", day, mostCustomers);
	}
}