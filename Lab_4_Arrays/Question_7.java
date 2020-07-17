/*Write a method that accepts 2 arrays and prints the second array containing the first
and last elements from the first array.

int[] x = {1,2,3};
int[] y = {}; = > [1,3]
int[] a = {7,4,6,2};
int[] b = {}; = > [7,2]
  
 */
package Lab_4_Arrays;

import java.util.Arrays;

public class Question_7 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {};
		
		int[] a = {7,4,6,2};
		int[] b = {};
		System.out.println(Arrays.toString(firstAndLastElement(x, y)));
		System.out.println(Arrays.toString(firstAndLastElement(a, b)));
		
	}
	
	public static int [] firstAndLastElement(int [] x, int [] y) {
		
		y = new int[2];
		
		y[0] = x[0];
		
		y[y.length-1] = x[x.length-1];
		
		return y;
	}

}
