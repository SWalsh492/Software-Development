import java.util.Scanner;

public class JavaScanner6
{
	public static void main(String[] args)
	{
		double price;
		double vat;
		double finalPrice;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Price of Product: ");
		price = keyboard.nextDouble();
		System.out.println("_______________________________");
		System.out.println("Price of product is " + price);
		vat = price/100*23;
		System.out.println("VAT at 23% is: " + vat);
		System.out.println("\n\n");
		System.out.println("TOTAL COST: " + (price + vat));



	}


}
