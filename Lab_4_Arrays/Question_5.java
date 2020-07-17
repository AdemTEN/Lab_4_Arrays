/*Write a method that accepts an array and prints an array with the elements "rotated
left”

int[] x = {1,2,3}; = > [2,3,1]
int[] y = {17,12,10,8}; = > [12,10,8,17]
int[] a = {7,0,0}; = > [0,0,7]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_5 {

	public static void main(String[] args) {
		
		int [] x = {1,2,3};
		int [] y = {17,12,10,8,5,7,0,};
		
		
		System.out.println(Arrays.toString(rotatedLeft(x)));
		System.out.println(Arrays.toString(rotatedLeft(y)));
		
		
		
	}
	
	public static int [] rotatedLeft(int [] array) {
		
		int [] rotatedArray = new int[array.length];
		
			rotatedArray[rotatedArray.length-1] = array[0];
		
		for(int i = 1; i <array.length; i++) {
			
			 rotatedArray[i-1] = array[i];
			
		}
		
	        return rotatedArray;
		
	}

}
