/*Write a method that accepts an array and return true if 6 appears as either the first or
last element in the array. The array will be length 1 or more.

int[] x = {1,2,6}; = > true
int[] y = {6,1,2,3}; = > true
int[] z = {13,6,1,2,3}; = > false

 * 
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_1 {

	public static void main(String[] args) {

		int[] x = { 6, 12, 15 };
		int[] y = { 6, 1, 2, 3 };
		int[] z = { 13, 6, 1, 2, 3 };

		System.out.println(is6AppeaarsFirstOrLastElement(x));
		System.out.println(is6AppeaarsFirstOrLastElement(y));
		System.out.println(is6AppeaarsFirstOrLastElement(z));
	}

	public static boolean is6AppeaarsFirstOrLastElement(int[] six) {

		if (six.length < 1) {
			System.out.println("Invalid array");
			return false;
		} else {
			if (six[0] == 6 || six[six.length - 1] == 6) {
				return true;
			} else {
				return false;
			}

		}

	}
}
