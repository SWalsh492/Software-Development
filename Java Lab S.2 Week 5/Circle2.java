public class Circle2
{
	private double radius;
	private double diameter;
	private double area;

	public Circle2()
	{
		radius = 1;
		diameter = radius*2;
		area = 3.1415 *(radius*radius);
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
		diameter = radius*2;
		area = 3.1415 *(radius*radius);
	}

	public double getRadius()
	{
		return radius;
	}

	public double getDiameter()
	{
		return diameter;
	}

	public double getArea()
	{
		return area;
	}
}