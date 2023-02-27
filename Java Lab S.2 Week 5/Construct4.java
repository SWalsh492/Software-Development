public class Construct4
{
	public static void main(String[] args)
	{
		Bike trek = new Bike(599.95, "Red");
		Bike focus = new Bike(499.99, "Green");
		Bike felt = new Bike(399.95, "Blue");
		Bike raleigh = new Bike(950.95, "Matt Black");



		System.out.println("Trek bike costs " + trek.getPrice() + " and the colour is " + trek.getColour());

		System.out.println("Focus bike costs " + focus.getPrice() + " and the colour is " + focus.getColour());

		System.out.println("Felt bike costs " + felt.getPrice() + " and the colour is " + felt.getColour());

		System.out.println("Raleigh bike costs " + raleigh.getPrice() + " and the colour is " + raleigh.getColour());


	}
}