public class Car
{
	private String make;
	private String model;
	private double engine;
	private int year;
	private String colour;

	public Car()
	{
		year = 2022;
	}

	public Car(String make, String model, String colour)
	{
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public Car(String make, String model, double engine, int year, String colour)
	{
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.year = year;
		this.colour = colour;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setEngine(double engine)
	{
		this.engine = engine;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public void setColour(String colour)
	{
		this.colour = colour;
	}





	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public double getEngine()
	{
		return engine;
	}

	public int getYear()
	{
		return year;
	}

	public String getColour()
	{
		return colour;
	}
}