public class SampleEx3_Q3
{
    public static void main(String[] args)
    {
      	//Create an instance of the Computer object
	   	Computer c1 = new Computer();
	   	Computer c2 = new Computer();
	   	Computer c3 = new Computer();

	   	c1.setName("Dell optiplex");
	   	c1.setRam(4);
	   	c1.setDisk(1.0);

	   	c2.setName("Dell Dimesion");
	   	c2.setRam(8);
	   	c2.setDisk(1.5);

	   	c3.setName("Apple Mac");
	   	c3.setRam(16);
	   	c3.setDisk(1.25);

	   	System.out.println(c1.getName() + "\n" + c1.getRam() + "\n" + c1.getDisk() + "\n" + c1.getRating() + "\n");
	   	System.out.println(c2.getName() + "\n" + c2.getRam() + "\n" + c2.getDisk() + "\n" + c2.getRating() + "\n");
	   	System.out.println(c3.getName() + "\n" + c3.getRam() + "\n" + c3.getDisk() + "\n" + c3.getRating() + "\n");
	}
}