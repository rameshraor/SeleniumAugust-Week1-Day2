package week1.Day2Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Declare input array
		int[] data = { 3, 2, 11, 4, 6, 7 };

		// 1) Arrange the array in ascending order
		Arrays.sort(data);

		// 2) Pick the 2nd element from the last and print it
		System.out.println("The 2nd element from the last in the sorted array = " + data[data.length - 2]);

	}

}
