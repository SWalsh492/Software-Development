class Exercise6
{
	public static void main(String[] args)
	{
		Car porsche = new Car();

		porsche.setYearModel(2004);
		porsche.setMake("Porsche");
		porsche.setSpeed(0);

		System.out.println("Current status of the car: \nYear Model: " + porsche.getYearModel());
		System.out.println("Make: " + porsche.getMake());
		System.out.println("Speed: " + porsche.getSpeed());

		for(int i = 1; i <=5; i++)
		{
			porsche.accelerate();
		}
		System.out.println("\nAccelerating... \nNow the speed is " + porsche.getSpeed());

		for(int i = 1; i <=5; i++)
		{
			porsche.brake();
		}
		System.out.println("\nBraking... \nNow the speed is " + porsche.getSpeed());
	}
}