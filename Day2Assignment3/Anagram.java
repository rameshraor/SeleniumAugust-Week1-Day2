package week1.Day2Assignment3;

import java.util.Arrays;

/* 
 * Code to check if two strings are anagrams
 */

public class Anagram {

	// Declare a String and initialize
	String text1 = "stops";

	// Declare another String and initialize
	String text2 = "potss";

	public void CheckAnagram() {

		// Initialize the flag as False
		boolean isAnagram = false;

		// a) Check length of the strings are same then (Use A Condition)
		int text1Length = text1.length();
		int text2Length = text2.length();

		if (text1Length == text2Length) {

			// b) Convert both Strings in to characters
			char[] arrText1 = text1.toCharArray();
			char[] arrText2 = text1.toCharArray();

			// sort the 2 arrays to check if they have the same characters
			Arrays.sort(arrText1);
			Arrays.sort(arrText2);

			System.out.println("arrText1 :" + Arrays.toString(arrText1));
			System.out.println("arrText2 :" + Arrays.toString(arrText2));

			isAnagram = Arrays.equals(arrText1, arrText1);

		} else {
			System.out.println("The string lengths are NOT the same.");
			;
		}

		if (isAnagram) {
			System.out.println("The strings " + text1 + " and " + text2 + " are Anagrams");
		} else {
			System.out.println("The strings " + text1 + " and " + text2 + " are NOT Anagrams");
		}

	}

	public static void main(String[] args) {

		/*
		 * call the method to check if the 2 strings are anagrams
		 */

		Anagram myAnagramObj = new Anagram();
		myAnagramObj.CheckAnagram();

	}

}
