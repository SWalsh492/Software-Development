public class Sandwich
{
	private String ingrediant;
	private String bread;
	private double price;

	public Sandwich(String ingrediant, String bread, double price)
	{
		this.ingrediant = ingrediant;
		this.bread = bread;
		this.price = price;
	}

	public Sandwich(String ingrediant)
	{
		this.ingrediant = ingrediant;
	}

	public Sandwich(double price)
	{
		this.price = price;
	}

	public Sandwich()
	{
		ingrediant = "cheese";
		bread = "white";
		price = 3.50;
	}

	public void setIngrediant(String ingrediant)
	{
		this.ingrediant = ingrediant;
	}

	public void setBread(String bread)
	{
		this.bread = bread;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}



	public String getIngrediant()
	{
		return ingrediant;
	}

	public String getBread()
	{
		return bread;
	}

	public double getPrice()
	{
		return price;
	}
}