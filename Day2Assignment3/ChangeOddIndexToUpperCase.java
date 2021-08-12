package week1.Day2Assignment3;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		// Declare String Input as Follow
		String test = "changeme";

		// a) Convert the String to character array
		char[] myCharArray = test.toCharArray();

		// Determine the string length
		int strLength = test.length();
		System.out.println("strLength : " + strLength);

		// b) Traverse through each character (using loop)
		for (int i = 0; i <= (strLength - 1); i++) {

			// Get the current character
			char currCharacter = myCharArray[i];
			System.out.println(" i = " + i + "   ||   currCharacter = " + currCharacter);

			// c)find the odd index within the loop (use mod operator)
			if ((i % 2) == 0) {

				// d)within the loop, change the character to uppercase, if the index is odd
				// else don't change
				
				System.out.println("Before change : myCharArray[" + i + "] :" + myCharArray[i]);
				myCharArray[i] = Character.toUpperCase(currCharacter);
				System.out.println("After change : myCharArray[" + i + "] :" + myCharArray[i]);
			
			} else {
			
				System.out.println("NO change : myCharArray[" + i + "] :" + myCharArray[i]);
			}
		}

		System.out.println("The updated string is : " + Arrays.toString(myCharArray));

	}

}
