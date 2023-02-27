/*
Name: Shane Walsh,
Student ID: G00406694,
Date: 01/03/22
*/

public class ShaneWalshQuestion3
{
    public static void main(String[] args)
    {
      	// Creates three objects of the Book class
	   	Book b1 = new Book();
	   	Book b2 = new Book();
	   	Book b3 = new Book();

		// Sets information to values for each object
	   	b1.setName("Harry Potter");
	   	b1.setAuthor("J.K. Rowling");
	   	b1.setPrice(10.99);
	   	b1.setPages(250);

	   	b2.setName("The Catcher in the Rye");
		b2.setAuthor("J.D. Salinger");
		b2.setPrice(8.99);
	   	b2.setPages(192);

	   	b3.setName("Wuthering Heights");
		b3.setAuthor("Emily Bronte");
		b3.setPrice(14.99);
	   	b3.setPages(422);

		// Outputs the objects using getters
	   	System.out.println("Book Name: "+ b1.getName() + "\nAuthor: " + b1.getAuthor() + "\nPrice: " + b1.getPrice() + "\nPages: " + b1.getPages() + "\n");

	   	System.out.println("Book Name: "+ b2.getName() + "\nAuthor: " + b2.getAuthor() + "\nPrice: " + b2.getPrice() + "\nPages: " + b2.getPages() + "\n");

	   	System.out.println("Book Name: "+ b2.getName() + "\nAuthor: " + b2.getAuthor() + "\nPrice: " + b2.getPrice() + "\nPages: " + b2.getPages() + "\n");

		// Calls the getReduction method
	   	b1.getReduction(1);
	   	b1.getReduction(4);

	}
}