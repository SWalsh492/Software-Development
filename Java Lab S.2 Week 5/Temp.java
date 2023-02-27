public class Temp
{
	private double temp;

	public Temp()
	{
		temp = 0;
	}

	public void setTemp(double temp)
	{
		this.temp = temp;
	}

	public double getTemp()
	{
		return temp;
	}


	public boolean isWaterFreezing()
	{
		if(temp <= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isWaterBoiling()
	{
		if(temp >= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isEthylFreezing()
	{
		if(temp <= -113)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isEthylBoiling()
	{
		if(temp >= 78)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isOxygenFreezing()
	{
		if(temp <= -219)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isOxygenBoiling()
	{
		if(temp >= -188)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}