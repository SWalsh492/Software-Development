public class Static7
{
	public static void main(String[] args)
	{
		Month a = new Month();
		System.out.println(a.getMonthNumber());
		Month b = new Month(2);
		System.out.println(b.getMonthNumber());

		a.setMonth("August");

		System.out.println(a.getMonthNumber());

		a.setMonth("April");
		System.out.println(a.getMonthNumber());

		b.setMonthNumber(6);

		System.out.println(b.getMonthName());

		System.out.println(a);

		Month.monthMessage(11);


	}
}