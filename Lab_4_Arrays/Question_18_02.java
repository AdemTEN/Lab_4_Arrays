/*Write a function that accepts an array and prints the sum of the numbers in the
array. Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count

int[] x = {1,2,2,1} = > 6
int[] y = {1,1} = > 2
int[] a = {1,2,2,1,13} = > 6
int[] b = {1,2,2,1,13,3} = > 6
 */
package Lab_4_Arrays;

public class Question_18_02 {

	public static void main(String[] args) {
		
		int[] x = { 1, 2, 3, 1 };
		int[] y = { 1, 1 };
		int[] b = { 1, 2, 2, 13, 1, 13, 13,13,13, 3, 13 };
		int[] a = { 1, 2, 2, 1, 13};

		System.out.println(sumBefore13(x));
		System.out.println(sumBefore13(y));
		System.out.println(sumBefore13(b));
		System.out.println(sumBefore13(a));

		
	}

	public static int sumBefore13 (int [] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] == 13) {
				break;
			}else {
				sum += array[i];
			}
			
		}
		return sum;
	}
}
