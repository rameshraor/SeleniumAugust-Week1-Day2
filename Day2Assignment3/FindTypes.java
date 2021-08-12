package week1.Day2Assignment3;

/*
 * Find the types of characters in a given string
 */

public class FindTypes {

	public static void main(String[] args) {

		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each

		// a) Convert the String to character array
		char[] arrMyString = test.toCharArray();
		int lengthMyString = arrMyString.length;

		// b) Traverse through each character (using loop)
		for (int i = 0; i <= (lengthMyString - 1); i++) {

			// c) Find if the given character is what type using (if)

			/*
			 * i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar iv)
			 * else -> consider as special character
			 */

			if (Character.isLetter(arrMyString[i])) {
				letter++;
			} else if (Character.isDigit(arrMyString[i])) {
				num++;
			} else if (Character.isSpaceChar(arrMyString[i])) {
				space++;
			} else {
				specialChar++;
			}
		}

		// Print the counts here

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
