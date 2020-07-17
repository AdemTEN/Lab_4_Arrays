package Lab_4_Arrays;

import java.util.Arrays;

public class Question_9 {

	public static void main(String[] args) {
	
		int[] x = {4,5,6};
		System.out.println(Arrays.toString(doubleTheLength(x)));

	}
	
	public static int [] doubleTheLength( int [] array) {
		
		int newArray [] = new int [array.length * 2];
		
		newArray[newArray.length-1] = array[array.length-1];
		
		return newArray;
	}

}
