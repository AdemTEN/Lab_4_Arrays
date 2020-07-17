/*Write a method that accepts an array and check the length of the array first.
If the length is more than one, check if the first element and last element are equal. if it is
print true, if not print false.
If the length is not more than 1, print not valid an array

int[] x = {1,2,3}; = > false
int[] y = {1,2,3,1}; = > true
int[] z = {1,2,1}; = > true
int[] k = {1}; = > not a valid array
 */
package Lab_4_Arrays;

public class Question_2 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 1, 2, 3, 1 };
		int[] z = { 1, 2, 1 };
		int[] k = { 1 };

		System.out.println(isEualFirstAndLast(x));
		System.out.println(isEualFirstAndLast(y));
		System.out.println(isEualFirstAndLast(z));
		System.out.println(isEualFirstAndLast(k));

	}

	public static String isEualFirstAndLast(int[] array) {

		if (array.length < 2) {
			return "not valid array";
		} else {
			if (array[0] == array[array.length - 1]) {
				return "true";
			} else {
				return "false";
			}
		}

	}

}
