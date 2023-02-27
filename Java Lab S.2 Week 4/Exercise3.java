class Exercise3
{
	public static void main(String[] args)
	{
		Phone apple = new Phone();

		apple.setModel("Apple iphone");
		apple.setPrice(599.99);
		apple.setStock(11);

		System.out.println(apple.getModel() + " " + apple.getPrice() + " " + apple.getStock());

		Phone samsung = new Phone();

		samsung.setModel("Samsung S20");
		samsung.setPrice(549.99);
		samsung.setStock(4);

		System.out.println(samsung.getModel() + " " + samsung.getPrice() + " " + samsung.getStock());

		Phone nokia = new Phone();

		nokia.setModel("Nokia 5310");
		nokia.setPrice(95.0);
		nokia.setStock(6);

		System.out.println(nokia.getModel() + " " + nokia.getPrice() + " " + nokia.getStock());

	}
}