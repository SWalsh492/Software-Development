class Exercise2
{
	public static void main(String[] args)
	{
		Toy toy1 = new Toy();

		toy1.setName("Spinner");
		toy1.setPrice(10.99);

		System.out.println(toy1.getName() + " " + toy1.getPrice());

		Toy toy2 = new Toy();

		toy2.setName("Baby Yoda");
		toy2.setPrice(19.99);

		System.out.println(toy2.getName() + " " + toy2.getPrice());

		Toy toy3 = new Toy();

		toy3.setName("Batmobile");
		toy3.setPrice(35.49);

		System.out.println(toy3.getName() + " " + toy3.getPrice());


	}
}