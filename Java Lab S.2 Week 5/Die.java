import java.util.Random;

public class Die
{
	private int sides = 6;
	private int value;
	private double total;
	private double probOfHope;

	Random randomNumber = new Random();

	public Die(int sides)
	{
		this.sides = sides;
	}

	public void roll()
	{
		value = randomNumber.nextInt(sides) + 1;
		total += value;
	}

	public int getValue()
	{
		return value;
	}

	public String getMean(int numTimes)
	{
		return "The mean of your dice rolls is: " + total / numTimes;
	}

	public double getHope(double hopeNum)
	{
		probOfHope = (hopeNum/sides);
		return probOfHope;
	}



}