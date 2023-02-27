public class RetailItem
{
	private String description;
	private int unitsOnHand;
	private double price;

	// Setters
	public void setDescript(String des)
	{
		description = des;
	}

	public void setUnits(int units)
	{
		unitsOnHand = units;
	}

	public void setPrice(double cost)
	{
		price = cost;
	}

	// Getters

	public String getDescript()
	{
		return description;
	}

	public double getUnits()
	{
		return unitsOnHand;
	}

	public double getPrice()
	{
		return price;
	}

}