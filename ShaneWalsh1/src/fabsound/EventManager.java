package fabsound;

public class EventManager extends Musician {
int age;
String name;
// constructors
	public EventManager(int age) {
		this.age = age;
	}
	public EventManager(int age, String name) {
		this(age); // first line of code - calls top constructor
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		
	}
	@Override
	void display() {
		
	}

}
