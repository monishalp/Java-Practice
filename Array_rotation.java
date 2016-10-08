///////////////////////////////////////////////////////////////////////
// ArrayRotation.java                                                //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class Array_rotation {
	 public static void main(String[] args)
	 {

	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	int order = 4;
	for (int i = 0; i < order; i++) {
	    for (int j = arr.length - 1; j > 0; j--) {
	        int temp = arr[j];
	        arr[j] = arr[j - 1];
	        arr[j - 1] = temp;
	    }
}
	 for(int j = 0; j<arr.length; j++){
         System.out.print("\t" + arr[j]);
	 }

}
}





