package codeSnippets;

import simple.*;
import java.util.*; // this causes a collision - Vector and List predefined

public class LibTest {

	public static void main(String[] args) {
		// Vector v = new Vector(); // java.util - moused into error
		simple.List l = new simple.List();
	}
}
