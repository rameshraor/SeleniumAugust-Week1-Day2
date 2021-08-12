package week1.Day2Assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare the array & the values
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// get the length of the array
		int arrLength = arr.length;

		// declare an int variable named count, and initialize to zero
		int count;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i <= (arrLength - 1); i++) {

			// initialize count to zer, before the inner loop starts
			count = 0;

			// iterate from i to the length of the array by adding 1 to it (inner loop
			// starts here)
			// This is to compare the i-th array element with the subsequent array elements
			for (int j = i + 1; j <= (arrLength - 1); j++) {

				// compare both the loop variables & check they're equal
				if (arr[i] == arr[j]) {

					count++;

				}
			}

			/*
			 * Out of the inner loop, check and print the first array variable if count is
			 * more than 0
			 */
			if (count > 0) {
				System.out.println("Out of the inner loop. The array element arr[" + i + "] = " + arr[i] + " has "
						+ count + " duplicates.");
			} else {
				System.out.println(
						"Out of the inner loop. The array element arr[" + i + "] = " + arr[i] + " has NO duplicates.");
			}

		}
	}

}
