/*Write a method that accepts an array and prints the number of even numbers in the
array.

int[] x = {2,1,2,3,4} = > 3
int[] y = {2,2,0} = > 3
int[] z = {1,3,5} = > 0
 */
package Lab_4_Arrays;

public class Question_16 {

	public static void main(String[] args) {

		int[] x = { 2, 1, 2, 3, 4 };
		
		System.out.println(numberOfEvenNumbers(x));
	}

	public static int numberOfEvenNumbers(int[] array) {

		int countEven = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				countEven++;
			}

		}

		return countEven;
	}

}
