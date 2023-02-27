package Equivalence;

public class Equivalence {

	public static void main(String[] args) {
		// Integer n1 = new Integer(456); Deprecated, banished, archived... killed! /:-{
		Integer n1 = Integer.valueOf(456);
		Integer n2 = Integer.valueOf(456);
		Integer n3 = Integer.valueOf(4);
		Integer n4 = Integer.valueOf(4);
		Float f1 = Float.valueOf(4f);
		Float f2 = Float.valueOf(4f);
		String s1 = new String("ann");
		String s2 = new String("ann");



		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		// applies to Integer and Shorts
		//-128 to 127 reference same memory space
		System.out.println(n3==n4);
		System.out.println(n3.equals(n4));
		System.out.println(f1==f2); // different memory references
		System.out.println(f1.equals(f2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
