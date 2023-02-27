package exceptionhandling;
class SimpleException extends Exception{}

public class SimpleExceptionDemo {
void f() throws SimpleException{
	System.out.println("Throwing Simple Exception for f()");
	throw new SimpleException();
}
	public static void main(String[] args) {
		SimpleExceptionDemo sed = new SimpleExceptionDemo(); // new object
		try {
			sed.f();
		} catch (SimpleException e) {
			e.printStackTrace();
			System.err.println("Caught it");
		}
		
	}

}
