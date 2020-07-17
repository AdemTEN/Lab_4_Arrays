/*Write a method that accepts 2 arrays and consider the sum of the values in each array.
Print the array which has the largest sum. In event of a tie, print "equal"

int[] x = {1,2} int[] y = {3,4} = > [3,4]
int[] x = {5,6} int[] y = {3,8} = > equal
int[] x = {1,1} int[] y = {1,0} = > [1,1]
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {
		
		int[] x = {1,2};
		int[] y = {3,4};
		
		int[] x1 = {5,6};
		int[] y1 = {3,8};
				
		int[] x2 = {1,1}; 
		int[] y2 = {1,0};
		
		System.out.println(whichSumIsLargest(x, y));
		System.out.println(whichSumIsLargest(x1, y1));
		System.out.println(whichSumIsLargest(x2, y2));
		
	}
	public static String whichSumIsLargest(int [] array1, int [] array2) {
		int sumArray1 = 0;
		int sumArray2 = 0;
		
		for(int value : array1) {
			sumArray1 += value;
		}
		
		for(int value : array2) {
			sumArray2 += value;
		}
		
		if(sumArray1>sumArray2) {
			return Arrays.toString(array1);
		}else if(sumArray2>sumArray1) {
			return Arrays.toString(array2);
		}else{
			return "Equal";
		}
	}

}
