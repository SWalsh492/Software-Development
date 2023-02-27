package revision;

public class EqualsMethod {
	int x,y;
	
	@Override
	public boolean equals(Object obj) {
		EqualsMethod other =(EqualsMethod)obj;
		if(other.x==x)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		//Wrapper classes - equals() method compares objects
		//String class compares objects
			//Integer x1 = new Integer(4); // deprecated
		Integer x1 = Integer.valueOf(4);
		Integer x2 = Integer.valueOf(4);
		Integer x3 = Integer.valueOf(400); // outside 128, point to different spots
		Integer x4 = Integer.valueOf(400); // outside 128, point to different spots
		String s1 = "Joe";
		String s2 = "Joe";
		String s3 = new String("Joe");
		String s4 = new String("Joe");
		EqualsMethod t1 = new EqualsMethod();
		EqualsMethod t2 = new EqualsMethod();
		t1.x = 100;
		t2.x = 100;

		System.out.println(x1==x2);
		System.out.println(x1.equals(x2));
		System.out.println(x3==x4);
		System.out.println(x3.equals(x4));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));


	}

}
