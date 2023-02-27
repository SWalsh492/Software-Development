package revision;

public class MethodToString {
	int x=4;
	@Override
	public String toString() {
		return (" x is " + x);
	}
	public static void main(String[] args ) {
		MethodToString m = new MethodToString();
		System.out.println("m is " + m); //print object as a string
	}
}
