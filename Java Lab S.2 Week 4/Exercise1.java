class Exercise1
{
	public static void main(String[] args)
	{
		Square box1 = new Square();
		box1.setLength(10);
		System.out.println("The box1 length is : "+ box1.getLength());

		Square Shape1 = new Square();
		Shape1.setLength(55);
		System.out.println("The shape1 length is : "+ Shape1.getLength());

		Square Alpha = new Square();
		Alpha.setLength(512);
		System.out.println("The alpha length is : "+ Alpha.getLength());


		System.out.println("The box1 area is : "+ box1.getArea());
		System.out.println("The shape1 area is : "+ Shape1.getArea());
		System.out.println("The alpha area is : "+ Alpha.getArea());

	}
}