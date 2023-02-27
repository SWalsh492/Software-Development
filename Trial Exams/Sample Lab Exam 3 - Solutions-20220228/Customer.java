public class Customer
{
	private String firstname;
	private String surname;
	private int age;

	public Customer(String firstname)
	{
		this.firstname = firstname;
	}

	public Customer(String firstname, String surname)
	{
		this.firstname = firstname;
		this.surname = surname;
	}

	public Customer(String firstname, String surname, int age)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}

	public Customer()
	{
		firstname = "None";
		surname = "None";
		age=0;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public String getSurname()
	{
		return surname;
	}

	public int getAge()
	{
		return age;
	}

}


