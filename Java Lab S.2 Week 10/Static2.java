public class Static2
{
	public static void main(String[] args)
	{
		int money = 100;
		System.out.printf("%d Euro to Dollar: %.2f \n", money, Currency.euroToDollar(money));
		System.out.printf("%d dollar to Euro: %.2f \n", money, Currency.dollarToEuro(money));
		System.out.printf("%d Euro to Sterling: %.2f \n", money, Currency.euroToSterling(money));
		System.out.printf("%d Sterling to Euro: %.2f \n", money, Currency.sterlingToEuro(money));
		System.out.printf("%d Sterling to Dollar: %.2f \n", money, Currency.sterlingToDollar(money));
		System.out.printf("%d Dollar to Sterling: %.2f \n", money, Currency.dollarToSterling(money));

	}
}