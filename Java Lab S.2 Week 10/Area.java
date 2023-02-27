public class Area
{
	public static double calcCircle(double radius)
	{
		return 3.1415*(radius*radius);
	}

	public static double calcRectangleArea(double width, double length)
	{
		return width*length;
	}

	public static double calcCylinderArea(double radius, double height)
	{
		return 3.1415*(radius*radius)*height;
	}
}