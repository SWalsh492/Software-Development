package quicksolutions;

//10. Interface with abstract, default and static methods
public interface JavaCertification {
	int REGISTRATION_FEE = 300;
	float DISCOUNT_FACTOR = .2f;
	float EXAM_FEE = 100;
	
	abstract void payExamFee();
	default void displayRegistrationFee() { //10c. Default display reg. fee
		System.out.println("The Registration Fee is " + REGISTRATION_FEE);
	};
	static void displayExamFee() { // 10b. Static display exam fee
		System.out.println("The Exam Fee is " + EXAM_FEE);
	};
	
}
