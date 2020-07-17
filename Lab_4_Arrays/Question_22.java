/*Write a method that accepts an array and prints true if the number 1's is greater
than the number 4's

int[] x = {1,4,1} = > true
int[] x = {1,4,1,4} = > false
int[] x = {1,1} = > true
 */
package Lab_4_Arrays;

public class Question_22 {

	public static void main(String[] args) {

		int[] x = { 1, 4, 1 };
		int[] y = { 1, 4, 1, 4 };
		int[] z = { 1, 1 };
		int[] k = { 4, 1, 4, 4 };

		System.out.println(is1_s_GreaterThan4_(x));
		System.out.println(is1_s_GreaterThan4_(y));
		System.out.println(is1_s_GreaterThan4_(z));
		System.out.println(is1_s_GreaterThan4_(k));
	}

	public static String is1_s_GreaterThan4_(int[] array) {

		int count1 = 0;
		int count4 = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 1) {
				count1++;
			}else if (array[i] == 4) {
				count4++;
			}
		}

		if (count1 > count4) {
			return "true";
		} else {
			return "false";
		}
	}

}
