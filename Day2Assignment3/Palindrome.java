package week1.Day2Assignment3;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Build a logic to find the given string is Palindrome or not
		 */

		// a) Declare A String value as"madam"
		String varStr = "madam";

		// b) Declare another String rev value as ""
		String varRevStr = "";

		// Determine the length of the original string
		int lengthStr = varStr.length();

		// c) Iterate over the String in reverse order
		for (int i = (lengthStr - 1); i >= 0; i--) {

			// d) Add the char into rev
			// Assign the characters in the original string to reverse string in the reverse
			// order
			varRevStr = varRevStr + varStr.charAt(i);

		}

		// e) Compare the original String with the reversed String, if it is same then print palinDrome
		if (varStr.equals(varRevStr)) {
			System.out.println("The string " + varStr + " is a palindrome.");
		}
		else {
			System.out.println("The string " + varStr + " is NOT a palindrome.");
		}
	
	}

}
