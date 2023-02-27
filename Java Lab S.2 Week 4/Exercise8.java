class Exercise8
{
	public static void main(String[] args)
	{
		RetailItem item1 = new RetailItem();

		item1.setDescript("Jacket");
		item1.setUnits(12);
		item1.setPrice(59.95);

		System.out.println("Item #1 \nDescription: " + item1.getDescript());
		System.out.println("Units on Hand: " + item1.getUnits());
		System.out.println("Price: " + item1.getPrice());

		RetailItem item2 = new RetailItem();

		item2.setDescript("Designer Jeans");
		item2.setUnits(40);
		item2.setPrice(34.95);

		System.out.println("\nItem #2 \nDescription: " + item2.getDescript());
		System.out.println("Units on Hand: " + item2.getUnits());
		System.out.println("Price: " + item2.getPrice());

		RetailItem item3 = new RetailItem();

		item3.setDescript("Shirt");
		item3.setUnits(20);
		item3.setPrice(24.95);

		System.out.println("\nItem #3 \nDescription: " + item3.getDescript());
		System.out.println("Units on Hand: " + item3.getUnits());
		System.out.println("Price: " + item3.getPrice());


	}
}