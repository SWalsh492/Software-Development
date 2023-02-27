package polymorphism;

public class ShapeTest {
	static Shape randShape() {
		switch((int)(Math.random()*3)) {
		default:
		case 0: return new Circle();
		case 1: return new Triangle();
		} // end switch
	} // end method

	public static void main(String[] args) {
		Shape [] s = new Shape[9];
		
		// fill up array with shapes
		for(int i=0; i<s.length; i++)
			s[i]=randShape();
		
		//make polymorphic method calls
		for(int i=0;i<s.length; i++) {
			s[i].draw();
		}
	}

}
