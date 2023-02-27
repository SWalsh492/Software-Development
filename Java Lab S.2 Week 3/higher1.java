public class higher1
{
	public static void main(String[] args)
	{
		higher(7,7);

	}

	public static void higher(int x, int y)
	{
		if(x > y)
		{
			System.out.println(x + " is greater than " + y);
		}
		else if(y > x)
		{
			System.out.println(y + " is greater than " + x);
		}
		else
		{
			System.out.println("Numbers are equal");
		}
	}

}