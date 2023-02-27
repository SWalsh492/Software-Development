public class Construct11
{
	public static void main(String[] args)
	{

		Circle2 a = new Circle2();
		Circle2 b = new Circle2();
		Circle2 c = new Circle2();

		a.setRadius(5);
		b.setRadius(50);

		System.out.println("The area of a is " + a.getArea() + "\nThe diameter of a is " + a.getDiameter());
		System.out.println("The area of b is " + b.getArea() + "\nThe diameter of b is " + b.getDiameter());
		System.out.println("The area of c is " + c.getArea() + "\nThe diameter of c is " + c.getDiameter());


	}
}