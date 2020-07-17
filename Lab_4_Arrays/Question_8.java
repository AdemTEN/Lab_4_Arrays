/*Write a method that accepts an array and prints true if it contains a 2 or a 3
 
int[] x = {2,5}; = > true
int[] y = {4,3}; = > true
int[] z = {4,5}; = > false
int [] k = {7,8,9,10,11,12};  
 */
package Lab_4_Arrays;

public class Question_8 {

	public static void main(String[] args) {

		int [] x = {2,5};
		int [] y = {4,3};
		int [] z = {4,5};
		int [] k = {7,8,9,10,11,12};
		
		System.out.println(contains2Or3(x));
		System.out.println(contains2Or3(y));
		System.out.println(contains2Or3(z));
		System.out.println(contains2Or3(k));
	}
	
	public static String contains2Or3(int [] array) {
		
		boolean flag = false;
		 
		for(int i = 0; i<array.length; i++) {
			
			if (array[i] == 2 || array[i] == 3) {
				
			flag = true;
			break;
			
			}
			
		}
		
		if (flag) {
			return "true";
			
		}else {
			return "false";
		}
	}

}
