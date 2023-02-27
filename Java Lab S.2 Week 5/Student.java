public class Student
{
	private String firstname;
	private String surname;
	private int age;

	public Student(String firstname)
	{
		this.firstname = firstname;
	}

	public Student()
	{
		firstname = "No name provided";
		surname = "No name provided";
		age = 0;
	}

	public Student(String firstname, String surname, int age)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
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