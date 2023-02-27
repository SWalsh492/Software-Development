class Exercise5
{
	public static void main(String[] args)
	{
		Data Joe = new Data();

		Joe.setName("Joe Mahoney");
		Joe.setAge(27);
		Joe.setAddress("724 22nd Street");
		Joe.setPhone("(555)555-1234");

		System.out.println("My information: \nName: " + Joe.getName());
		System.out.println("Age: " + Joe.getAge());
		System.out.println("Address: " + Joe.getAddress());
		System.out.println("phone: " + Joe.getPhone());

		Data Friend1 = new Data();

		Friend1.setName("Geri Rose");
		Friend1.setAge(24);
		Friend1.setAddress("149 East Bay Street");
		Friend1.setPhone("(555)555-5678");

		System.out.println("\nFriend #1's information: \nName: " + Friend1.getName());
		System.out.println("Age: " + Friend1.getAge());
		System.out.println("Address: " + Friend1.getAddress());
		System.out.println("phone: " + Friend1.getPhone());

		Data Friend2 = new Data();

		Friend2.setName("John Carbonni");
		Friend2.setAge(28);
		Friend2.setAddress("22 King Street");
		Friend2.setPhone("(555)555-0123");

		System.out.println("\nFriend #2's information: \nName: " + Friend2.getName());
		System.out.println("Age: " + Friend2.getAge());
		System.out.println("Address: " + Friend2.getAddress());
		System.out.println("phone: " + Friend2.getPhone());

	}
}