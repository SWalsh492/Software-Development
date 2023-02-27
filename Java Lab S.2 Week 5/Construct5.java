public class Construct5
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob", "Smith", 45);
		Student s3 = new Student();

		System.out.println(s1.getFirstname() + "\n" + s1.getSurname() + "\n" + s1.getAge());
		System.out.println("\n" + s2.getFirstname() + "\n" + s2.getSurname() + "\n" + s2.getAge());
		System.out.println("\n" + s3.getFirstname() + "\n" + s3.getSurname() + "\n" + s3.getAge());


	}
}