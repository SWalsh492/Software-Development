import java.util.Scanner;


public class CurrencyMethod
{
	public static void main(String[] args)
	{
		double output;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Currency amount: ");
		double currency = keyboard.nextDouble();

		System.out.println("Is this Dollars or Euros? (Enter 'D' for dollars or'E' for euros): ");
		String moneyType = keyboard.nextLine();
		moneyType = keyboard.nextLine();

		if(moneyType.equalsIgnoreCase("E"))
		{
			output = eurosToDollars(currency);
			System.out.println(output);
		}
		else
		{
			output = dollarsToEuros(currency);
			System.out.println(output);

		}

	}

	public static double eurosToDollars(double currency)
	{
		return (currency*1.21);
	}

	public static double dollarsToEuros(double currency)
	{
		return (currency/1.21);
	}

}