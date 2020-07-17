/*Write a function that accepts and array. For each multiple of 10 in the given array, change all
the values following it to be that multiple of 10, until encountering another multiple of 10.

int[] x = {2,10,3,4,20,5};
System.out.println(Arrays.toString(tenRun(x))); // [2, 10, 10, 10, 20, 20]

int[] y = {10,1,20,2};
System.out.println(Arrays.toString(tenRun(y))); // [10, 10, 20, 20]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_29 {

	public static void main(String[] args) {

		int[] x = { 2, 1, 20, 30, 40, 2, 230, 4, 5, 4, 8, 6500, 4 };
		System.out.println(Arrays.toString(multiple10(x)));

	}

	public static int[] multiple10(int[] array) {

		int[] tempArray = new int[1];

		int itemp = 0;
		tempArray[0] = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 != 0) {
				continue;
			} else {
				itemp = i;
				tempArray[0] = array[i];
				break;
			}

		}
		for (int i = itemp; i < array.length; i++) {
			if (array[i] % 10 != 0) {
				array[i] = tempArray[0];
			} else {
				tempArray[0] = array[i];

			}
		}

		return array;
	}

}
