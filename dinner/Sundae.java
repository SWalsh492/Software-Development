package dinner;

public class Sundae {
	//private constructor
	private Sundae() {
		
	}
static Sundae makeASundae() {
	return new Sundae(); // way around a private constructor
}
}
