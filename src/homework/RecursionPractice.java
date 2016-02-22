package homework;

public class RecursionPractice {

	public static void main(String[] args) {
		System.out.println(reverseString("something"));
	}
	
	public static String reverseString(String str) {
		if (str.length() == 1) return str;
		else return reverseString(str.substring(1)) + str.substring(0,1);
	}
}