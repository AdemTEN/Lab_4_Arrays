/*Write a method that accepts two arrays of the same length. For every element in array1,
consider the corresponding element in array2 (at the same index). Return the count of
the number of times that two elements differ by 2 or less, but are not equal.

int[] x = {1,2,3};
int[] y = {2,3,10};
Output: 2

int[] x = {1,2,3};
int[] y = {2,3,5};
Output:3
 */
package Lab_4_Arrays;

public class Question_25 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 2, 3, 10 };
		System.out.println(differBy2OrLess(x, y));

		int[] x1 = { 1, 2, 3, 2, 1 };
		int[] y1 = { 2, 3, 5, 2, 3 };
		System.out.println(differBy2OrLess(x1, y1));
	}

	public static int differBy2OrLess(int[] array1, int[] array2) {

		if (!(array1.length == array2.length)) {
			System.exit(0);
		}
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				continue;
			} else {
				if ((array2[i] - array1[i]) <= 2) {
					count++;
				}
			}
		}
		return count;
	}

}
