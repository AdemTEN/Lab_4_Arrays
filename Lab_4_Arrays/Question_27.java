/*Write a method that accepts an array and prints true if the array contains, somewhere,
three increasing adjacent numbers like 4,5,6,... or 23,24,25.

int[] x = {1,4,5,6,2}; //true
int[] y = {1,2,3}; //true
int[] z = {1,2,4,5,8,9}; //false
 */
package Lab_4_Arrays;

public class Question_27 {

	public static void main(String[] args) {
		
		int [] x = {1,4,5,6,2};
		int [] y = {1,2,3};
		int [] z = {1,2,4,5,7,8};
		
		System.out.println(isThereThreeIncreasingNumber(x));
		System.out.println(isThereThreeIncreasingNumber(y));
		System.out.println(isThereThreeIncreasingNumber(z));
	}

	public static String isThereThreeIncreasingNumber(int[] array) {

		boolean flag = false;

		for (int i = 0; i < array.length - 2; i++) {

			if (array[i + 1] == array[i] + 1 && array[i + 2] == array[i] + 2) {

				flag = true;
				break;
			}

		}

		if (flag) {
			return "true";
		} else {
			return "false";
		}
	}

}
