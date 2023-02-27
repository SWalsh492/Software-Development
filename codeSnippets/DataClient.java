package codeSnippets;

public class DataClient {
 int users;
	public static void main(String[] args) {
	DataClient client = new DataClient();	
		// users+=1; wont compile as 'users' not static
	client.users +=1;// object can access the class
	//variable from static method 'main'

	}

}
