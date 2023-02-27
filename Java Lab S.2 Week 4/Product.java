public class Product
{
	private String productName;
	private double price;

	// Setters
	public void setName(String name)
	{
		productName = name;
	}

	public void setPrice(double cost)
	{
		price = cost;
	}

	// Getters

	public String getName()
	{
		return productName;
	}

	public double getPrice()
	{
		return price;
	}

	public double retailPrice()
	{
		double retail = (price +0.45*price);
		return retail;
	}

}