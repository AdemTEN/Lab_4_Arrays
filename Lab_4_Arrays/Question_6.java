/*Write a method that accepts an array and figure out which is greatest element in the
array, a and set all the other elements to be that value. Print the changed array.

int[] x = {1,2,3}; = > [3,3,3]
int[] y = {11,5,9}; = > [11,11,11]
int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]
 * 
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_6 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] a = { 110, 5, 98, 0, 1200, 11, -4 };
		int[] y = { 11, 5, 9 };
		
		System.out.println(Arrays.toString(maxValue(x)));
		System.out.println(Arrays.toString(maxValue(y)));
		System.out.println(Arrays.toString(maxValue(a)));
	}

	public static int[] maxValue(int[] array) {
		int max;
		max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = max;
		}

		return array;
	}

}
