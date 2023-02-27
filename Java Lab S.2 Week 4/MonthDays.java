public class MonthDays
{
	private int month;
	private int year;


	// Setters
	public void setMonth(int months)
	{
		month = months;
	}

	public void setYear(int years)
	{
		year = years;
	}


	// Getters

	public int getNumberOfDays()
	{
		switch(month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;

			case 4: case 6: case 9: case 11:
				return 30;

			case 2:
				return getFebruaryDays();

			default:
				return 31;

		}
	}

	public int getFebruaryDays()
	{
		if(year % 100 == 0 && year % 400 == 0)
		{
			return 29;
		}
		else if(year % 100 != 0 && year % 4 == 0)
		{
			return 29;
		}
		else
		{
			return 28;
		}
	}

}