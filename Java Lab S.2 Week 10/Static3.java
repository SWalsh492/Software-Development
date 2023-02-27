public class Static3
{
	public static void main(String[] args)
	{
		System.out.printf("The area of a circle with a radius of 20.0 is %.2f\n", Area.calcCircle(20.0));
		System.out.printf("The area of a rectangle with the length of 10 and a width of 20 is %.2f\n", Area.calcRectangleArea(10,20));
		System.out.printf("The area of a cylinder with a radius of 10 and a height of 15 is %.2f\n", Area.calcCylinderArea(10,15));


	}
}