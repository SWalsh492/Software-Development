package codeSnippets;
class No{
	int i;
}
public class Assignment {

	public static void main(String[] args) {
		No n1 = new No();
		No n2 = new No();
		n1.i = 9;
		n2.i = 47;
		System.out.println("1: n1.i " + n1.i + "2: n2.i " + n2.i);
		n1=n2; // aliasing at work
		System.out.println("1: n1.i " + n1.i + "2: n2.i " + n2.i);
		n1.i=27;
		System.out.println("1: n1.i " + n1.i + "2: n2.i " + n2.i);

	}

}
