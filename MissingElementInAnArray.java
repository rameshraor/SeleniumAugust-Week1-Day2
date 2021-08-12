package week1.Day2Assignments;

import java.util.Arrays;


public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		// Array declaration
		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array
		Arrays.sort(arr);
		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i=0; i <= (arr.length - 1); i++) {
			
			System.out.println("i = " + i);
			System.out.println("arr[" + i + "] = " + arr[i]);
			
			// check if the iterator variable is not equal to the array values respectively
			if (arr[i] == i) {
				System.out.println("Array value for arr[" + i + "] equals the interator");
				System.out.println("Breaking the for loop, as the array number has matched the iteration");
				break;
			}
		}

	}

}
