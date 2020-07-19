/*values are different from it. Write a method that accepts an array and a number and
prints the given array where every instance of the given value which is alone is replaced
by whichever value to its left or right is larger.

int[] x = {1,2,3};
int n = 2;
System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]

int[] y = {1, 2, 3, 2, 5, 2};
int n1 = 2;
System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_30 {

	public static void main(String[] args) {
		int[] x = { 1, 2, 2, 2, 3,2, 4 };
		int n = 2;

		int[] y = { 1, 2, 3, 2, 5, 2 };
		int n1 = 2;

		System.out.println(Arrays.toString(newArray(x, n)));
		System.out.println(Arrays.toString(newArray(y, n1)));
	}

	public static int[] newArray(int[] array, int number) {

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] == number && (array[i - 1] != number && array[i + 1] != number)) {
				if(array[i-1]>array[i+1]){
					array[i] = array[i-1];
				}else {
					array[i] = array[i+1];
				}
			}

	}
		return array;

}
}