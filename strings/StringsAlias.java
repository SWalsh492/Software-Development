package strings;

public class StringsAlias {

	public static void main(String[] args) {
		String x = "Java";
		String y=x; //aliasing at work
		System.out.println("y string is " + y);
		System.out.println("x string is " + x);
		x=x+" Beans"; // new space created
		System.out.println("y string is " + y);
		System.out.println("x string is " + x);
		

	}

}
