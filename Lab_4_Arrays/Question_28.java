/*Write a method that accepts start and end numbers. Given start and end
numbers, return a new array containing the sequence of integers from start up to
but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_28 {

	public static void main(String[] args) {

		System.out.println(startAndArray(5, 10));
		System.out.println(startAndArray(11, 18));
		System.out.println(startAndArray(1, 3));

	}

	public static String startAndArray(int start, int end) {

		int[] newArray = new int[end - start];

		for (int i = 0; i < newArray.length; i++) {

			newArray[i] = start + i;
		}

		return Arrays.toString(newArray);

	}

}
