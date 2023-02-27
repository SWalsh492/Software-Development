package revision;

public class TestConstructor {
	int x, y, z;
	
	// overloaded constructors
	public TestConstructor(int x) {
		this.x=x;
	}
	TestConstructor(int x, int y) {
		this(x);
		this.y = y;
	}
	
	TestConstructor(int x, int y, int z) {
		this(x,y); // calls constructor
		this.z = z;
	}
	
	
	//explicit default constructor
	public TestConstructor() {
		x=9;
	}

	public static void main(String[] args) {
		TestConstructor t = new TestConstructor();
		
	}

}
