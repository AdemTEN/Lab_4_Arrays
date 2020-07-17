/*A value is "everywhere" in an array if for every pair of adjacent elements in the array, at
least one of the pair is that value.
Write a method that accepts an array and a number, and prints true if the given number
is everywhere in the array.

int[] x = {1, 2, 1, 3};
int a = 2;
Output: false

int[] x = {1, 2, 1, 3};
int a = 1;
Output: true
 */
package Lab_4_Arrays;

public class Question_24 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 1, 3 };
		int a = 2;

		int[] y = { 1, 2, 1, 3 };
		int b = 1;
		System.out.println(isAWalueEverwhere(x, a));
		System.out.println(isAWalueEverwhere(y, b));
	}

	public static String isAWalueEverwhere(int[] array, int number) {
		
        boolean flag = false;
        
		for (int i = 0; i < array.length-2; i++) {

			if (array[i] == number && (array[i+1] == number || array[i+2] == number)) {
				
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
