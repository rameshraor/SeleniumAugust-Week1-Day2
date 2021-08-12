package week1.Day2Assignment3;

/* 
 * // Check number of occurrences of a char (eg 'e') in a String
 */

public class CharOccurance {

	public static void main(String[] args) {

		// Declare the string - to be checked
		String str = "welcome to chennai";

		// Declare the character to be checked
		char charChk = 'e';

		// Declare and initialize a variable count to store the number of occurrences
		int countNumChars = 0;

		// convert the string into char array
		char[] arrMyStr = str.toCharArray();

		// Get the length of the array
		int lengthArrMyStr = arrMyStr.length;

		// Traverse from 0 till the array length
		for (int i = 0; i <= (lengthArrMyStr - 1); i++) {

			// Check the char array has the particular char ("e") in it
			if (arrMyStr[i] == charChk) {
				countNumChars++;
			}

		}

		// print the count out of the loop
		System.out.println("The number of occurrences of the character " + charChk + " in the string " + str + " = "
				+ countNumChars);

	}

}
