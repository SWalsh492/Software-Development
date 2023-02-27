class Exercise7
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();

		emp1.setName("Susan Meyers");
		emp1.setIDNumber(47899);
		emp1.setDepartment("Accounting");
		emp1.setPosition("Vice President");

		System.out.println("Employee #1 \nName: " + emp1.getName());
		System.out.println("ID Number: " + emp1.getIDNumber());
		System.out.println("Department: " + emp1.getDepartment());
		System.out.println("Position: "  + emp1.getPosition());

		Employee emp2 = new Employee();

		emp2.setName("mark Jones");
		emp2.setIDNumber(39119);
		emp2.setDepartment("IT");
		emp2.setPosition("Programmer");

		System.out.println("\nEmployee #2 \nName: " + emp2.getName());
		System.out.println("ID Number: " + emp2.getIDNumber());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Position: "  + emp2.getPosition());

		Employee emp3 = new Employee();

		emp3.setName("Joy Rogers");
		emp3.setIDNumber(81774);
		emp3.setDepartment("Manufacturing");
		emp3.setPosition("Engineer");

		System.out.println("\nEmployee #3 \nName: " + emp3.getName());
		System.out.println("ID Number: " + emp3.getIDNumber());
		System.out.println("Department: " + emp3.getDepartment());
		System.out.println("Position: "  + emp3.getPosition());

	}
}