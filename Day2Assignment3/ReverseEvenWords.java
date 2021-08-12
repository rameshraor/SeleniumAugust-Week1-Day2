package week1.Day2Assignment3;

/*
 * Build a logic to reverse the even position words (output: I ma a erawtfos tester)
 */

public class ReverseEvenWords {

	// Declare the input as Follow
	String test = "I am a software tester";
	String arrSplitWords[];

	public String[] SplitWords() {

		// a) split the words and have it in an array
		String arrWords[] = test.split("\\s");

		return arrWords;

	}

	public void RevEvenWords(String arrSplitWordsTemp[]) {

		// Declare and Initialize a reverse string
		String reversedString = "";

		// b) Traverse through each word (using loop)
		for (int i = 0; i <= (arrSplitWordsTemp.length - 1); i++) {
			// Declare a temporary string
			String tempWord = arrSplitWordsTemp[i];
			// Declare the reversed string, and initialize it to blank
			String reverseWord = "";

			// Check if the word is even (i.e., 2nd, 4th, 6th, etc.) - NOTE that the index
			// starts with zero, so we have to check for odd index
			if (i % 2 != 0) {

				// Assign the characters in reverse to the temporary string
				for (int j = (tempWord.length() - 1); j >= 0; j--) {
					reverseWord = reverseWord + tempWord.charAt(j);
				}

				// For the even word, add the reversed word plus space
				reversedString = reversedString + reverseWord + " ";
			}

			else {
				// For the odd word, add the original word plus space
				reversedString = reversedString + arrSplitWordsTemp[i] + " ";
			}

		}

		// Displaying the string after reverse
		System.out.print("Reversed string : " + reversedString);

	}

	public static void main(String[] args) {

		// Declare the object for the class
		ReverseEvenWords myRevEvenWordsObj = new ReverseEvenWords();

		// Call the SplitWords method and return the splitted words in the form of array
		String arrSplitWords[] = myRevEvenWordsObj.SplitWords();

		// Call the RevEvenWords method and print the desired result
		myRevEvenWordsObj.RevEvenWords(arrSplitWords);

	}

}
