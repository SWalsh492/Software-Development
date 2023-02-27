public class Employee
{
	private String firstName;
	private String surname;
	private int id;

	public Employee(String firstName, String surname, int id)
	{
		this.firstName = firstName;
		this.surname = surname;
		this.id = id;
	}


	public String toString()
	{
		return "EMPLOYEE DETAILS: \nFirst Name: " + firstName + "\nSurname: " + surname + "\nID: " + id + "\n";
	}

}