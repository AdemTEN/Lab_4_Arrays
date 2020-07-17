/*Write a method that accepts two arrays and prints how many of the arrays have 1 as their first
element

int[] x = {1,2,3}
Int[] y = {1,3}
Output = 2

int[] x = {7,2,3}
Int[] y = {1}
Output = 1

int[] x = {3,2,4}
Int[] y = {4,3,4}
Output = 0 
 */
package Lab_4_Arrays;

public class Question_12 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {1,3};
		
		int[] x1 = {7,2,3};
		int[] y1 = {1};
	
		int[] x2 = {3,2,4};
		int[] y2 = {4,3,4};
		System.out.println(howMany1(x, y));
		System.out.println(howMany1(x1, y1));
		System.out.println(howMany1(x2, y2));
		
	}

	public static int howMany1(int[] array1, int[] array2) {
		
		int count1 = 0;

		if (array1[0] == 1) {
			count1++;
		}
		if (array2[0] == 1) {
			count1++;
		}
		return count1;
	}

}
