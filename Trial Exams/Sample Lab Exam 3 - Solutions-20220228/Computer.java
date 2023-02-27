public class Computer
{
  private String name;
  private int ram;
  private double disk;

	public char getRating()
	{
	  	if(ram >= 8 && disk > 1)
	  	{
			return 'A';
		}
		else
		{
			return 'B';
		}
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setRam(int ram)
	{
		this.ram = ram;
	}

	public void setDisk(double disk)
	{
		this.disk = disk;
	}

	public String getName()
	{
		return name;
	}

	public double getDisk()
	{
		return disk;
	}

	public int getRam()
	{
		return ram;
	}
}