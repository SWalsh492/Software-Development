package abstractClasses;

public class Lion extends Feline {
	//forced to override sleep and eat methods
@Override
void eat() {
	System.out.println("Lion Eating");
	
}
@Override
	void sleep() {
	System.out.println("Lion Sleeping");
		
	}
	public static void main(String[] args) {
	Lion simba = new Lion();
	simba.eat();
	simba.roam();

	}

}
