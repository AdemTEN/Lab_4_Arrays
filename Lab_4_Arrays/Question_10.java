/*Write a method that accepts an array and prints true if the array contains 2 twice or 3
twice.

int[] x = {2,2}; = > true
int[] y = {3,3}; = > true
int[] a = {2,3}; = > false
int[] b = {12,20,42}; = > false
int[] c = {2,2,2}; = > false 
 */
package Lab_4_Arrays;

public class Question_10 {

	public static void main(String[] args) {

		int[] x = { 2, 2 };
		int[] y = { 3, 3 };
		int[] a = { 2, 3, 3 };
		int[] b = { 12, 20, 42 };
		int[] c = { 2, 2, 2, 3, 3, 3 };

		System.out.println(twice2Or3(x));
		System.out.println(twice2Or3(y));
		System.out.println(twice2Or3(a));
		System.out.println(twice2Or3(b));
		System.out.println(twice2Or3(c));
	}

	public static String twice2Or3(int[] array) {
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == 2) {
				count2++;
			}else if (array[i] == 3) {
				count3++;
			}

		}

		if (count2 == 2 || count3 == 2) {
			return "true";
		} else {
			return "false";
		}
	}

}
