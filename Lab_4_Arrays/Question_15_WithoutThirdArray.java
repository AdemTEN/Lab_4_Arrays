package Lab_4_Arrays;

import java.util.Arrays;

public class Question_15_WithoutThirdArray {

	public static void main(String[] args) {
	
		int[] x = {1,2,3,4};
		int[] y = {1,2,3};
		int[] z = {8,6,7,9,5};	
		
		System.out.println(Arrays.toString(swapFirstAndLastElement(x)));
		System.out.println(Arrays.toString(swapFirstAndLastElement(y)));
		System.out.println(Arrays.toString(swapFirstAndLastElement(z)));
	}

	
	 public static int [] swapFirstAndLastElement(int [] array) {
		 
		 array[0] = array[0] + array[array.length-1];
		 
		 array[array.length-1] = array[0] - array[array.length-1];
			
		 array[0] = array[0] -array[array.length-1];
				 
			return array;	 
				 
	 }

}
