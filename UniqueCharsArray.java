///////////////////////////////////////////////////////////////////////
// UniqueCharArray.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueCharsArray {

	 
	 public static void main(String Args[])
	 {
		 int[] arr = {1,2,5,6,4,3,2,1,2,8};
		// Distinct(arr);
		 HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		 for(int i:arr)
		 {
			 hs.put(i, 0);
		 }
		 System.out.println("Unique Char Array is");
		 System.out.println(hs.keySet());
	 }
	
}

