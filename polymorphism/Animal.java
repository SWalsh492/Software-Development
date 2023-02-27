package polymorphism;

public abstract class Animal {
	abstract void eat();


public static void main(String[] args) {
	Animal[] animals = new Animal[5];
	animals[0] = new Dog();
	animals[1] = new Cat();
	animals[2] = new Wolf();
	animals[3] = new Lion();
	animals[4] = new Hippo();
	for(int i=0; i < animals.length; i++)
	{
		animals[i].eat();
	}
	Animal rex = new Dog(); // roam() method wont work with polymorphism
	Dog toby = new Dog();
	rex.eat();
	//rex.roam();
	toby.roam();
	animals[0].eat(); // no access to roam method - using polymorphism
}

}
