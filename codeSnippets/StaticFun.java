package codeSnippets;
class StaticTest{
	static int i=47;
}
public class StaticFun {
//method
static int incr() {
	return ++StaticTest.i;
}
	public static void main(String[] args) {
		// create objects
	StaticTest st1= new StaticTest();
	StaticTest st2= new StaticTest();
	StaticFun sf = new StaticFun();
	StaticTest.i++; // access static variable-use class name
	System.out.println("st1.i is "+st1.i);
	System.out.println("st2.i is "+st2.i);
	//access is a static way
System.out.println("Access variable static way "+StaticTest.i);
System.out.println("Access method through object "+sf.incr());
System.out.println("Access method statically "+ StaticFun.incr());

	}

}
