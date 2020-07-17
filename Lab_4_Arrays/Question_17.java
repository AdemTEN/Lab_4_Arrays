/*Write a method that accepts an array and print the difference between the largest and
smallest values in the array.

int[] x = {10,3,5,6} = > 7
int[] y = {7,2,10,9} = > 8
int[] z = {2,10,7,2} = > 8
 */
package Lab_4_Arrays;

public class Question_17 {

	public static void main(String[] args) {
		
		int [] x = {10,3,5,6};
		int [] y = {7,2,10,9};
		int [] z = {2,10,7,2};
		
		System.out.println(differenceLargestAndSmallest(x));
		System.out.println(differenceLargestAndSmallest(y));
		System.out.println(differenceLargestAndSmallest(z));
		
	}
	
	public static int differenceLargestAndSmallest(int [] array) {
		
		int max = array[0];
		for(int value: array) {
			if(value>max) {
				max = value;
			}
		}
		
		int min = array[0];
		for(int value : array) {
			if(value<min) {
				min = value;
			}
		}
		
		int difference = max - min;
		
		return difference;
	}

}
