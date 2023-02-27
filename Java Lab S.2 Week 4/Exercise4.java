class Exercise4
{
	public static void main(String[] args)
	{
		Product prod1 = new Product();

		prod1.setName("Twix Bar");
		prod1.setPrice(0.40);

		System.out.println("Product Details: \nProduct 1 Name: " + prod1.getName());
		System.out.println("Product 1 Cost Price: " + prod1.getPrice());
		System.out.println("Product 1 Retail Price: " + prod1.retailPrice());



		Product prod2 = new Product();

		prod2.setName("Daz Washing Powder 10Kg");
		prod2.setPrice(6.05);

		System.out.println("\nProduct Details: \nProduct 2 Name: " + prod2.getName());
		System.out.println("Product 2 Cost Price: " + prod2.getPrice());
		System.out.println("Product 2 Retail Price: " + prod2.retailPrice());


		Product prod3 = new Product();

		prod3.setName("Colgate Toothpaste");
		prod3.setPrice(1.25);

		System.out.println("\nProduct Details: \nProduct 3 Name: " + prod3.getName());
		System.out.println("Product 3 Cost Price: " + prod3.getPrice());
		System.out.println("Product 3 Retail Price: " + prod3.retailPrice());


		Product prod4 = new Product();

		prod4.setName("Granny Smiths 6-pack Apples");
		prod4.setPrice(1.10);

		System.out.println("\nProduct Details: \nProduct 4 Name: " + prod4.getName());
		System.out.println("Product 4 Cost Price: " + prod4.getPrice());
		System.out.println("Product 4 Retail Price: " + prod4.retailPrice());


	}
}