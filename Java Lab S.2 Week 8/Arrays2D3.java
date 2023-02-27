public class Arrays2D3
{
	public static void main(String[] args)
	{
		int[][] myData = new int[3][6];

		myData[0][0] = 10;
		myData[0][1] = 11;
		myData[0][2] = 12;
		myData[0][3] = 13;
		myData[0][4] = 14;
		myData[0][5] = 15;
		myData[1][0] = 16;
		myData[1][1] = 17;
		myData[1][2] = 18;
		myData[1][3] = 19;
		myData[1][4] = 20;
		myData[1][5] = 21;
		myData[2][0] = 22;
		myData[2][1] = 23;
		myData[2][2] = 24;
		myData[2][3] = 25;
		myData[2][4] = 26;
		myData[2][5] = 27;






		System.out.println(myData[0][0] + " | " + myData[0][1] + " | " + myData[0][2]+ " | " + myData[0][3] + " | " + myData[0][4] + " | " + myData[0][5] + " | ");

		System.out.println(myData[1][0] + " | " + myData[1][1] + " | " + myData[1][2]+ " | " + myData[1][3] + " | " + myData[1][4] + " | " + myData[1][5] + " | ");

		System.out.println(myData[2][0] + " | " + myData[2][1] + " | " + myData[2][2]+ " | " + myData[2][3] + " | " + myData[2][4] + " | " + myData[2][5] + " | \n\n");

		myData[0][2] = 99;
		myData[1][3] = 50;
		myData[2][0] = 77;

		System.out.println("ARRAY AFTER UPDATING:");

		System.out.println(myData[0][0] + " | " + myData[0][1] + " | " + myData[0][2]+ " | " + myData[0][3] + " | " + myData[0][4] + " | " + myData[0][5] + " | ");

		System.out.println(myData[1][0] + " | " + myData[1][1] + " | " + myData[1][2]+ " | " + myData[1][3] + " | " + myData[1][4] + " | " + myData[1][5] + " | ");

		System.out.println(myData[2][0] + " | " + myData[2][1] + " | " + myData[2][2]+ " | " + myData[2][3] + " | " + myData[2][4] + " | " + myData[2][5] + " | ");


	}
}