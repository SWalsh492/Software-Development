public class Construct3
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Donald", 75);
		Employee emp2 = new Employee("Alice", 20);
		Employee emp3 = new Employee("Bob", 30);
		Employee emp4 = new Employee("Charlie", 40);


		System.out.println("Emp1 name is " + emp1.getName() + " and age is " + emp1.getAge());

		System.out.println("Emp2 name is " + emp2.getName() + " and age is " + emp2.getAge());

		System.out.println("Emp3 name is " + emp3.getName() + " and age is " + emp3.getAge());

		System.out.println("Emp4 name is " + emp4.getName() + " and age is " + emp4.getAge());

	}
}