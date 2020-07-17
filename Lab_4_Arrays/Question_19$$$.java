/*Write a method that accepts an array and prints the total of the numbers in the
array, except ignore sections of numbers starting with a 6 and extending to the
next 7 (every 6 will be followed by at least one 7).

int[] x = {1,2,2} = > 5
int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
int[] a = {1,1,6,7,2} = > 4
int[] b = {1,1,6,2} = > 2
int[] c = {1,2,2,6,99,99,7,3,4} = > 12
 */
package Lab_4_Arrays;

public class Question_19$$$ {

	public static void main(String[] args) {
		
		int[] y = {1,2,2,6,99,99,7,3,6,2,4,8,7,4};
		
		System.out.println(totalnumbers(y));
		
	}
	
	public static int totalnumbers(int [] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 6) {
				
				while(array[i] != 7) {
					i++;
					if(i == array.length-1) {
						break;
					}
				}
			}else {
				sum += array[i];
			}
		
	}
		return sum;

}
}

