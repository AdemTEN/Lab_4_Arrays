/*Write a method that accepts an array and prints true if the sum of all 2's in the
array is exactly 8

int[] x = {2, 3, 2, 2, 4, 2} = > true
int[] x = {2, 3, 2, 2, 4, 2, 2} = > false
int[] x = {1, 2, 3, 4} = > false
 */
package Lab_4_Arrays;

public class Question_21 {

	public static void main(String[] args) {

		int[] x = { 2, 3, 2, 2, 4, 2 };
		int[] y = { 2, 3, 2, 2, 4, 2, 2 };
		int[] z = { 1, 2, 3, 4 };

		System.out.println(isSumofAll2Equal8(x));
		System.out.println(isSumofAll2Equal8(y));
		System.out.println(isSumofAll2Equal8(z));

	}

	public static String isSumofAll2Equal8(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				sum += array[i];
			}
		}
		if (sum == 8) {
			return "true";
		} else {
			return "false";
		}
	}

}
