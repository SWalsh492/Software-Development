import java.util.Scanner;

public class JavaIf10
{
	public static void main(String[] args)
	{
		int quantity;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter quantity being purchased: ");
		quantity = keyboard.nextInt();

		double cost;
		System.out.println("Enter cost: ");
		cost = keyboard.nextDouble();

		System.out.println("Cost is: " + (cost-(99*quantity)));

		if(quantity >=10)
		{
			System.out.println("You recieved a discount of " + 99 * quantity);
			System.out.println("Cost without discount would normally be " + cost);

		}
		if(quantity < 10)
		{
			System.out.println("There is no discount on this order");

		}


	}
}