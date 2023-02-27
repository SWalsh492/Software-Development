public class Construct6
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		Car car2 = new Car("Toyota", "Corolla", 1.4, 2019, "Red");
		Car car3 = new Car("Skoda", "octavia", 1.9, 2019, "Gold");
		Car car4 = new Car("Toyota","Avensis","Green");
		Car car5 = new Car();

		System.out.println("CAR 1: \nMake: " + car1.getMake() + "\nModel: " + car1.getModel() + "\nColour: " + car1.getColour() + "\nEngine Size: " + car1.getEngine() + "\nYear: " + car1.getYear() + "\n");

		System.out.println("CAR 2: \nMake: " + car2.getMake() + "\nModel: " + car2.getModel() + "\nColour: " + car2.getColour() + "\nEngine Size: " + car2.getEngine() + "\nYear: " + car2.getYear() + "\n");

		System.out.println("CAR 3: \nMake: " + car3.getMake() + "\nModel: " + car3.getModel() + "\nColour: " + car3.getColour() + "\nEngine Size: " + car3.getEngine() + "\nYear: " + car3.getYear() + "\n");

		System.out.println("CAR 4: \nMake: " + car4.getMake() + "\nModel: " + car4.getModel() + "\nColour: " + car4.getColour() + "\nEngine Size: " + car4.getEngine() + "\nYear: " + car4.getYear() + "\n");

		car5.setMake("Nissan");
		car5.setModel("Qashgai");
		car5.setColour("Black");
		car5.setEngine(1.6);
		car5.setYear(2012);

		System.out.println("CAR 5: \nMake: " + car5.getMake() + "\nModel: " + car5.getModel() + "\nColour: " + car5.getColour() + "\nEngine Size: " + car5.getEngine() + "\nYear: " + car5.getYear() + "\n");

	}
}