package finalkeyword;
class Value{
	int i=1;
}
public class FinalData {
final int i1 = 9;
static final int VAL_TWO = 99;
public static final int VAL_THREE = 39;
final int i4=(int)(Math.random()*20);
static final int i5 = (int)(Math.random()*20);
Value v1 = new Value();
final Value v2 = new Value();
static final Value v3 = new Value();
void print(String id) {
	System.out.println(id+": "+"i4 = " + i4 + " i5 = " + i5);
}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
		//fd1 .i1++; cant change final value
		fd1.v2.i++; // object is not constant
		fd1.v1 = new Value(); // OK -- not final
		//fd1.v2 = new Value(); cant change object ref
		// fd1.v3 = new Value(); cant change reference
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}

}
