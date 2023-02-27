package strings;

public class Student {
String studentName;
int number;
Student(String name, int no){
	studentName=name;
	number=no;
}//constructor
@Override
	public String toString() {
		return ("Name " + studentName + " Number " + number);
	}
	public static void main(String[] args) {
		Student joe = new Student("Joe Kelly", 2022);
		System.out.println(joe);
		System.out.println("student details are "+joe);
		
	}

}
