package codeSnippets;

class Letter{
	char c;
}

public class PassObject {
	// Passing object reference
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c='a';
		System.out.println("1:x.c is " + x.c);
		f(x); //pass object x to method
		System.out.println("2:x.c is " + x.c);
	}

}
