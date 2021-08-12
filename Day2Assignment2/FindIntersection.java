package week1.Day2Assignment2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare 1st array
		int[] firstArray = { 3, 2, 11, 4, 6, 7 };

		// Declare 2nd array
		int[] secondArray = { 1, 2, 8, 4, 9, 7 };

		// Declare for loop iterator from 0 to array length for 1st array
		for (int i = 0; i <= (firstArray.length - 1); i++) {

			// Declare for loop iterator from 0 to array length for 2nd array
			for (int j = 0; j <= (secondArray.length - 1); j++) {

				// Compare the i-th item in firstArray to all iterations in secondArray
				if (firstArray[i] == secondArray[j]) {

					// if there is a match, print the message
					System.out.println("The iteration # " + i + " in firstArray matches the iteration # " + j
							+ " in secondArray, and the matching value = " + firstArray[i]);
				}
			}

		}

	}

}
