/*Write a method that accepts 2 arrays and checks the lengths of the arrays first. If lengths
are more than 1, it prints true if the arrays have the same first element or they have the
same last element. If the length of the array is not more than 1, it prints the "array1 is not
a valid array " or "array2 is not a valid array"

int[] x = {1,2,3}; = >true
int[] y = {7,3};

int[] x1 = {1,2,3}; = >false
int[] y1= {7,3,2};

int[] x2 = {1,2,3}; = > true
int[] y2= {1,3};

int[] x3 = {1}; = > Array1 is not valid
int[] y3= {7,3};

int[] x4 = {1,2,3}; = > Array2 is not valid
int[] y4= {1};
 */
package Lab_4_Arrays;

public class Question_3 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 7, 3 };

		int[] x1 = { 1, 2, 3 };
		int[] y1 = { 7, 3, 2 };

		int[] x2 = { 1, 2, 3 };
		int[] y2 = { 1, 3 };

		int[] x3 = { 1 };
		int[] y3 = { 7, 3 };

		int[] x4 = { 12, 3 };
		int[] y4 = { 1 };

		System.out.println(arraysHaveSameFirstOrLast(y, y));
		System.out.println(arraysHaveSameFirstOrLast(x1, y1));
		System.out.println(arraysHaveSameFirstOrLast(x2, y2));
		System.out.println(arraysHaveSameFirstOrLast(x3, y3));
		System.out.println(arraysHaveSameFirstOrLast(x4, y4));

	}

	public static String arraysHaveSameFirstOrLast(int[] array1, int[] array2) {

		if (!(array1.length > 1)) {

			return "array1 is not a valid array";
		}
		if (!(array2.length > 1)) {

			return "array2 is not a valid array";
		}

		if (array1[0] == array2[0] || array1[array1.length - 1] == array2[array2.length - 1]) {

			return "true";

		} else {

			return "false";
		}

	}

}
