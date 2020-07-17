package Lab_4_Arrays;

public class Question_20 {

	public static void main(String[] args) {

		int[] x = {1,2,2};
		int[] y = {1, 2, 1,2,2,2};
		int[] a = {};
		int[] b = {2,2,2,1,2};
				
		System.out.println(isCointains2NextToA2(x));
		System.out.println(isCointains2NextToA2(y));
		System.out.println(isCointains2NextToA2(a));
		System.out.println(isCointains2NextToA2(b));
		
		
	}
	  public static String isCointains2NextToA2(int [] array) {
		  
		  boolean flag = false;
		  
		  for (int i = 0; i < array.length-1; i++) {
			  
			if(array[i] == 2 && array[i+1] == 2) {
				flag = true;
				break;
			}
		}
		  
		  if(flag) {
			  return "true";
		  }else {
			  return "false";
		  }
	  }

}
