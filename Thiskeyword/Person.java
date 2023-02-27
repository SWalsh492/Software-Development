package Thiskeyword;

public class Person {
String firstName, lastName;
@Override
	public String toString() {
	return(firstName+"" + lastName);
}
Person setFristName(String first) {
	firstName=first;
		return this; // object reference
}
Person setLastName(String last) {
	lastName=last;
	return this; // method returns object reference
}
	public static void main(String[] args) {
		Person student = new Person();
		student.setFristName("Hugo").setLastName("Wugo");
		System.out.println("Student name is "+student); // toString method at work
	}

}
