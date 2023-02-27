
public class Month
{
	private int monthNumber;

	// CONSTRUCTORS

	public Month()
	{
		monthNumber = 1;
	}

	public Month(int num)
	{
		if(num > 12 || num < 1)
		{
			monthNumber = 1;
		}
		else
		{
			monthNumber = num;
		}
	}

	// SETTERS

	public void setMonth2(String month)
	{

	}

	public void setMonth(String month)
	{
		String[] monthArray = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		for(int i = 0; i < 12; i++)
		{
			if(month.equalsIgnoreCase(monthArray[i]))
			{
				monthNumber = i+1;
			}
		}

	}

	public void setMonthNumber(int monthNumber)
	{
		if(monthNumber > 12 || monthNumber < 1)
		{
			monthNumber = 1;
		}
		else
		{
			this.monthNumber = monthNumber;
		}
	}


	// GETTERS


	public int getMonthNumber()
	{
		return monthNumber;
	}

	public String getMonthName()
	{
		String[] monthArray = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		return monthArray[monthNumber-1];
	}



	// To String

	public String toString()
	{
		String[] monthArray = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		return monthArray[monthNumber-1];
	}

	public static void monthMessage(int monthNumber)
	{
		if(monthNumber > 12 || monthNumber < 1)
		{
			System.out.println("This is not a valid month number");
		}
		else
		{
			System.out.println("The month number you entered was " + monthNumber);
		}
	}

}