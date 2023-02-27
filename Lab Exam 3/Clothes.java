/*
Name: Shane Walsh,
Student ID: G00406694,
Date: 01/03/22
*/

public class Clothes
{
	// Fields for Clothes class
	private String garment;
	private String brand;
	private float price;
	private boolean available;

	// Constructors
	public Clothes(String garment)
	{
		this.garment = garment;
	}

	public Clothes(float price, boolean available)
	{
		this.price = price;
		this.available = available;
	}

	public Clothes(String garment, String brand, float price, boolean available)
	{
		this.garment = garment;
		this.brand = brand;
		this.price = price;
		this.available = available;
	}

	public Clothes()
	{
		garment = "No details provided";
		brand = "No details provided";
		price = 100.00f;
	}

	// Getters
	public String getGarment()
	{
		return garment;
	}

	public String getBrand()
	{
		return brand;
	}

	public float getPrice()
	{
		return price;
	}

	public boolean getStock()
	{
		return available;
	}
}