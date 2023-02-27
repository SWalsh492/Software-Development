public class Person
{
	private String firstName;
	private static int instanceCount = 0;

	public Person(String f, String l)
	{
		firstName = f;
		instanceCount++;
	}

	public int getInstanceCount()
	{
		System.out.println("This is " + firstName);
		return instanceCount;
	}

	public static int count()
	{
		return instanceCount;
	}
}