/*Write a method that accepts 2 arrays and prints a new array containing all their
elements

int[] x = {1,2} int[] y = {3,4} = > [1,2,3,4]
int[] x = {4,4} int[] y = {2,2} = > [4,4,2,2]
int[] x = {9,2} int[] y = {3,4} = > [9,2,3,4]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_14 {

	public static void main(String[] args) {
	
		int[] x = {1,2};
		int[] y = {3,4};
		
		int[] x1 = {9,2};
		int[] y1 = {3,4};
		
		System.out.println(Arrays.toString(newArrayWithAllElement(x, y)));
		System.out.println(Arrays.toString(newArrayWithAllElement(x1, y1)));
	}

	public static int [] newArrayWithAllElement(int [] array1, int[] array2) {
		
		int [] newArray = new int [array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++) {
			newArray [i] = array1[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			newArray[array1.length+i] = array2[i];
		}
		
		
		return newArray;
		
		
	}
}
