package revision;

public class Circle extends Shape {
String colour;
int number;

	@Override
	void draw() {
		System.out.println("Draw a circle");
	}
	
	//overloading a method ONLY defined by arguments passed in
	//access modifier / reutrn type not relevant
	public String draw(String colour) {
		return colour;
	}
	
	void draw(String colour, int number) {
		
	}
	
	private void draw(int number, String colour) {
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
