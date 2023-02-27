public class VoidMethod11
{

	public static void main(String[] args)
	{
		calcAnnual("Hamilton", "Margaret", 1250.00);

		calcAnnual("Hopper", "Grace", 950.50);

		calcAnnual("Knuth", "Donald", 912.21);

	}

	public static void calcAnnual(String firstname, String lastname, double wage)
	{
		System.out.printf("NAME: %s %s \nWAGE: %.2f \n------------------------------\n", firstname, lastname, wage*52);
	}
}