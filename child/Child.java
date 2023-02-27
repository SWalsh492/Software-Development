package child;

import parent.*;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		//System.out.println("x in parent cannot be accessed" + "different package " + p.x);
		System.out.println("X in parent class can be accessed" + "accross pakages due to protected keyword" + c.x);	
	}
}
