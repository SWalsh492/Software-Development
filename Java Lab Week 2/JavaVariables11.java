public class JavaVariables11
{
	public static void main(String[] args)
	{
		int quantityItem1 = 6;
		double priceItem1 = 5.00;
		int quantityItem2 = 2;
		double priceItem2 = 4.00;
		double totalCost = (quantityItem1*priceItem1) + (quantityItem2*priceItem2);

		System.out.println("--- Receipt ---");
		System.out.println("  Item 1");
		System.out.println("  Price: " + priceItem1);
		System.out.println("  Quantity: " + quantityItem1);
		System.out.println("---------------");
		System.out.println("  Item 2");
		System.out.println("  Price: " + priceItem2);
		System.out.println("  Quantity: " + quantityItem2);
		System.out.println("---------------");
		System.out.println(" TOTAL COST:" + totalCost);





	}
}