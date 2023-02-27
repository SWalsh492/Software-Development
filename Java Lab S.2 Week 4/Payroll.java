public class Payroll
{
	private String name;
	private int idNumber;
	private double hourlyRate;
	private int hoursWorked;

	// Setters
	public void setName(String empName)
	{
		name = empName;
	}

	public void setIDNumber(int num)
	{
		idNumber = num;
	}

	public void setHourlyRate(double rate)
	{
		hourlyRate = rate;
	}

	public void setHoursWorked(int hours)
	{
		hoursWorked = hours;
	}

	// Getters

	public String getName()
	{
		return name;
	}

	public double getIDNumber()
	{
		return idNumber;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public int getHoursWorked()
	{
		return hoursWorked;
	}

}