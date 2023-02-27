package abstractClasses;

public abstract class Animal {

	abstract void eat();// abstract method public default

	//non abstract method
	void roam() {
		System.out.println("Animal Roaming");
	}
}
