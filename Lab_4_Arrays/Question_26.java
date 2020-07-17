/*Write a method that accepts an array and prints true if the array contains 3 even
or 3 odd values all next to each other.

int x[] = {2,1,3,5}; //true
int y[] = {2,1,2,5}; //false
int z[] = {2,4,2,5}; //true
 */
package Lab_4_Arrays;

public class Question_26 {

	public static void main(String[] args) {

		int[] x = { 2, 1, 3, 5 };
		int[] y = { 2, 1, 2, 5 };
		int[] z = { 1, 4, 2, 5, 2, 4, 1 };
		System.out.println(isContains3EvenOr3Odd(x));
		System.out.println(isContains3EvenOr3Odd(y));
		System.out.println(isContains3EvenOr3Odd(z));
	}

	public static String isContains3EvenOr3Odd(int[] array) {

		boolean flag = false;

		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
				flag = true;
			}
			if (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0) {
				flag = true;
			}
		}
		if (flag) {
			return "true";
		} else {
			return "false";
		}

	}

}
