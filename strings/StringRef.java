package strings;

public class StringRef {

	public static void main(String[] args) {
		String a="Java";
		String b="Java";
		String x="Ja";
		String y="va";
		String c;
		c=x+y;
		StringBuffer q = new StringBuffer("Java");
		StringBuffer d = new StringBuffer("Java");
		StringBuffer e = new StringBuffer("beans");
		StringBuffer f=d.append(e);
		if(a==b)
			System.out.println("a and b same object");
		else
			System.out.println("a and b not same object");
		
		if(b==c)
			System.out.println("b and c same object");
		else
			System.out.println("b and c not same object");
		
		if(d==f)
			System.out.println("d and f same object");
		else
			System.out.println("d and f not same object");
		System.out.println(e.reverse()); // StringBuffer object
		
	}

}
