/*
Name: Shane Walsh,
Student ID: G00406694,
Date: 01/03/22
*/

public class Book
{
	// Fields for Book class
	private String name;
	private String author;
	private int pages;
	private double price;

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setPages(int pages)
	{
		this.pages = pages;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}


	// Getters
	public String getName()
	{
		return name;
	}

	public String getAuthor()
	{
		return author;
	}

	public int getPages()
	{
		return pages;
	}

	public double getPrice()
	{
		return price;
	}


	// Price reduction method based on quantity
	public void getReduction(int quantity)
	{
		System.out.printf("Reduced price for quantity of %d %s book(s) is %.2f \n", quantity, name, (price*quantity)*0.90);
	}

}