/*Write a method that accepts a number and create and prints a new array of length
number, containing the numbers 0,1,2,...number-1.

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_23 {

	public static void main(String[] args) {
		
//		System.out.println(createArray(4));
//		System.out.println(createArray(1) );
//		System.out.println(createArray(10));

		System.out.println(printArray(4));
	}
	
	public static int[] createArray (int number) {
		
		int [] newArray = new int[number]; 
		
		for(int i = 0; i<number;i++) {
			newArray[i] = i;
		} 
	
		//return Arrays.toString(newArray);
		return newArray;
	}
	public static String printArray(int number) {
		
		return Arrays.toString(createArray(number));
	}


}
