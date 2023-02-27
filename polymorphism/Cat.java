package polymorphism;

public class Cat extends Animal implements Pet, Pet1{

	@Override
	void eat() {
		System.out.println("Cat Eating");
	}

	@Override
	public void play() {
		
	}

	@Override
	public void beFriendly() {
		
	}
	

}
