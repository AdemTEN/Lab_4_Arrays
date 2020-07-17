/*Write a method that accepts an array and prints the sum of all elements in the array
 
int[] x = {1,2,3}; = > 6
int[] y = {5,11,2}; = > 18
int[] z = {7,0,0}; = > 7
int[] a = {3,-2,10,4}; = > 15
 
 */
package Lab_4_Arrays;

public class Question_4 {

	public static void main(String[] args) {
	
		int [] x = {1,2,3};
		int [] a = {3,-2,10,4};
		
		System.out.println(sum(x));
		System.out.println(sum(a));
		
	}
	public static int sum (int [] array) {
	
		int sum = 0;
		for(int value : array) {
			
			sum += value;
		}
		
		return sum;
	}

}
