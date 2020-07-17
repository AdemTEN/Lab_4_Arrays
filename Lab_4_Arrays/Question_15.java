/*Write a method that accepts an array and swap the first and last element in the
array. Print the modified array

int[] x = {1,2,3,4} = > [4,2,3,1]
int[] y = {1,2,3} = > [3,2,1]
int[] z = {8,6,7,9,5} = > [5,6,7,9,8]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_15 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4};
		int[] y = {1,2,3};
		int[] z = {8,6,7,9,5};	
		
		System.out.println(Arrays.toString(swapFirstAndLastElements(x)));
		System.out.println(Arrays.toString(swapFirstAndLastElements(y)));
		System.out.println(Arrays.toString(swapFirstAndLastElements(z)));
	}
	
	public static int [] swapFirstAndLastElements( int[] array ) {
		
		int [] tempArray = new int [1];
		
		tempArray[0] = array[0];
		
		array[0] = array[array.length-1];
		
		array[array.length-1] = tempArray[0];
		
		return array;
		
	}

}
