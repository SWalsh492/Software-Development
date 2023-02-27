package Thiskeyword;

public class Point {
	int x; //class variables
	int y;
	int z;
	
	// constructor - local variables same as class variables
	Point(int x, int y){
		this.x=x; // current memory reference
		this.y=y;
	}
	Point(int x, int y, int z){
		this(x,y); // calls the constructor with 2 int's above
		//always first line in constructor
		this.z=z;
		
	}
	void setPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}

	public static void main(String[] args) {
		Point p = new Point(3,3);
		Point p1 = new Point(0,0,0);
		p.display();
		p.setPoint(5, 5);
		p.display();
	}

}
