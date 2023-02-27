public class Static6
{
	public static void main(String[] args)
	{
		Employee grace = new Employee("Grace", "Hopper", 123456);
		Employee bill = new Employee("Bill","Gates", 456789);
		Employee ada = new Employee("Ada", "Lovelace", 789123);
		Employee james = new Employee("James","Gosling", 456123);

		System.out.println(grace.toString());
		System.out.println(grace);
		System.out.println(bill);
		System.out.println(ada);
		System.out.println(james);




	}
}