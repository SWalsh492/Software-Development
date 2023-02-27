// Shane Walsh, G00406694, 26/04/2022

public class Technology
{
	// creates base fields, static fields, an array for item costs and a static control for the array
	private String brand;
	private String model;
	private char type;
	private double cost;
	private static double[] itemCosts = new double[10];
	private static int totalPhones;
	private static int totalComputers;
	private static int totalSpeakers;
	private static int totalOthers;
	private static int i;

	// four-argument constructor for building desired objects
	Technology(String brand, String model, char type, double cost)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		switch(type)
		{
			case 'C':
			case 'c':
				totalComputers++;
				break;

			case 'P':
			case 'p':
				totalPhones++;
				break;

			case 'S':
			case 's':
				totalSpeakers++;
				break;

			case 'O':
			case 'o':
				totalOthers++;
				break;
		}
		this.cost = cost;
		itemCosts[i] = cost;
		i++;
	}

	// Setters
	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setType(char type)
	{
		this.type = type;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	// Getters
	public String getBrand()
	{
		return brand;
	}

	public String getModel()
	{
		return model;
	}

	public char getType()
	{
		return type;
	}

	public double getCost()
	{
		return cost;
	}

	// toString method for outputting objects
	public String toString()
	{
		return "{ brand='" + brand + "', model='" + model + "', type='" + type + "', cost='" + cost + "' }";
	}

	// Static report method for displaying the number of items and total
	public static void report()
	{
		System.out.println("\n----------------------------");
		System.out.printf("Number of Phones: %d \nNumber of Computers: %d \nNumber of Speakers: %d \nNumber of Other Items : %d \nTotal Items: %d \n\n", totalPhones, totalComputers, totalSpeakers, totalOthers, (totalPhones + totalComputers + totalSpeakers + totalOthers));
	}

	// Static method for displaying array contents and total sales
	public static void displayTotal()
	{
		double totalSales = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Array index " + i + ": " + itemCosts[i]);
			totalSales += itemCosts[i];
		}
		System.out.printf("Total sales: %.2f \n", totalSales);
	}
}