package morepolymorphism;

class Animal{}
class Horse extends Animal{}
public class UseAnimals {
//overloaded methods
	void doStuff(Animal a)
	{
		System.out.println("In the animal Version");
	}
	void doStuff(Horse h) {
		System.out.println("In the Horse Version");
	}
	public static void main(String[] args) {
		UseAnimals us = new UseAnimals();
		Animal animalObj = new Animal();
		Animal animalRefToHorse = new Horse(); // polymorphism at work
		Horse horseObj = new Horse();
		us.doStuff(animalObj); // in the animal version
		us.doStuff(horseObj); // in the horse version
		us.doStuff(animalRefToHorse); // in the animal version
		// which overridden version of method to call decided at run time. 
		// But which overloaded version of the method to call based on ref. type of argument passed at compile time

	}
}