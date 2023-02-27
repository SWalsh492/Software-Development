package Equivalence;
	
class Value{
	int i;
	@Override // forced to override the equals() Object class
	public boolean equals(Object obj) {
		Value other = (Value)obj; // cast to Value type object
		if(other.i==i)
			return true;
		else return false;
	}
	
}
public class EqualsMethod2 {

	public static void main(String[] args) {
		
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i=v2.i=100;
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2));
		
	}

}
