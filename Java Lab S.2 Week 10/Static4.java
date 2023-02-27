public class Static4
{
	public static void main(String[] args)
	{
		Person a = new Person("Grace", "Hopper");
		Person b = new Person("Bill","Gates");

		System.out.println(a.getInstanceCount());
		System.out.println(b.getInstanceCount());


		Person c = new Person("Clarke","Kent");
		Person d = new Person("Bruce","Wayne");

		System.out.println(c.getInstanceCount());
		System.out.println(d.getInstanceCount());

		System.out.println(Person.count());
	}
}