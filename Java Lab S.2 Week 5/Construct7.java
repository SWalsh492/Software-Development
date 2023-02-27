public class Construct7
{
	public static void main(String[] args)
	{
		Sandwich s1 = new Sandwich("tuna","wheat", 4.99);
		Sandwich s2 = new Sandwich("tuna","Brown",2.99);
		Sandwich s3 = new Sandwich("cheese");
		Sandwich s4 = new Sandwich(3.99);
		Sandwich s5 = new Sandwich();

		System.out.println("You have ordered a " + s1.getIngrediant() + " on " + s1.getBread() + " bread, and the price is " + s1.getPrice() + "\n");

		System.out.println("You have ordered a " + s2.getIngrediant() + " on " + s2.getBread() + " bread, and the price is " + s2.getPrice() + "\n");

		System.out.println("You have ordered a " + s3.getIngrediant() + " on " + s3.getBread() + " bread, and the price is " + s3.getPrice() + "\n");

		System.out.println("You have ordered a " + s4.getIngrediant() + " on " + s4.getBread() + " bread, and the price is " + s4.getPrice() + "\n");

		System.out.println("You have ordered a " + s5.getIngrediant() + " on " + s5.getBread() + " bread, and the price is " + s5.getPrice() + "\n");


	}
}