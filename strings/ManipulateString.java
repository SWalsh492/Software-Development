package strings;

public class ManipulateString {
// reverse a string
	static String reverseString(String str) {
		String result="";
		for(int i=0; i<str.length();i++)
			result=str.charAt(i)+result;
		return result;
		
		
	}
	
	public static void main(String[] args) {
		String str1="stressed";
		String str2=reverseString(str1);
		System.out.println(str2);
	}

}
