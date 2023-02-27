public class Employee
{
	private String name;
	private int idNumber;
	private String department;
	private String position;

	// Setters / Mutators
	public void setName(String empName)
	{
		name = empName;
	}

	public void setIDNumber(int idNum)
	{
		idNumber = idNum;
	}

	public void setDepartment(String dep)
	{
		department = dep;
	}

	public void setPosition(String pos)
	{
		position = pos;
	}

	// Getters / Accessors

	public String getName()
	{
		return name;
	}

	public int getIDNumber()
	{
		return idNumber;
	}

	public String getDepartment()
	{
		return department;
	}

	public String getPosition()
	{
		return position;
	}


}