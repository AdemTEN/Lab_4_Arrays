/*Write a function that accepts an array and prints the sum of the numbers in the
array. Except the number 13 is very unlucky, so it does not count a number that
come immediately after a 13 also do not count.

int[] x = {1,2,2,1} = > 6
int[] y = {1,1} = > 2
int[] a = {1,2,2,1,13} = > 6
int[] b = {1,2,2,1,13,3} = > 6

 */
package Lab_4_Arrays;

public class Question_18$$$$$ {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 1 };
		int[] y = { 1, 1 };
		int[] b = { 1, 2, 2, 13, 1, 13, 13,13,13, 3, 13 };
		int[] a = { 1, 2, 2, 1, 13};

		System.out.println(sumOfNumbersExcept13(x));
		System.out.println(sumOfNumbersExcept13(y));
		System.out.println(sumOfNumbersExcept13(b));
		System.out.println(sumOfNumbersExcept13(a));

	}

	public static int sumOfNumbersExcept13(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1 && array[array.length - 1] == 13) {
				break;

			} else if (array[i] == 13) {

				while (array[i] == 13) {
					i++;
				}

			} else {

				sum += array[i];
			}

		}
		return sum;
	}

}
