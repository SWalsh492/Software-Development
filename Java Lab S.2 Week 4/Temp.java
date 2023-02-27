public class Temp
{
	private double ftemp;


	// Setters
	public void setFahrenheit(double fahren)
	{
		ftemp = fahren;
	}


	// Getters

	public double getFahrenheit()
	{
		return ftemp;
	}

	public double getCelcius()
	{
		return 0.55555 * (ftemp - 32);
	}

	public double getKelvin()
	{
		return (0.5555*(ftemp - 32)) + 273;
	}
}