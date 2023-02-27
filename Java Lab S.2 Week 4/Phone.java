public class Phone
{
	private String model;
	private double price;
	private int stock;

	// Setters
	public void setModel(String name)
	{
		model = name;
	}

	public void setPrice(double cost)
	{
		price = cost;
	}

	public void setStock(int num)
	{
		stock = num;
	}

	// Getters

	public String getModel()
	{
		return model;
	}

	public double getPrice()
	{
		return price;
	}

	public int getStock()
	{
		return stock;
	}

}