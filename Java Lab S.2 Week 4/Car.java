public class Car
{
	private String make;
	private int yearModel;
	private int speed;

	// Setters
	public void setYearModel(int year)
	{
		yearModel = year;
	}

	public void setMake(String carType)
	{
		make = carType;
	}

	public void setSpeed(int sp)
	{
		speed = sp;
	}

	// Getters

	public int getYearModel()
	{
		return yearModel;
	}

	public String getMake()
	{
		return make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void accelerate()
	{
		speed += 5;
	}

	public void brake()
	{
		speed -= 5;
	}

}