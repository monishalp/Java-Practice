///////////////////////////////////////////////////////////////////////
// SecondOccurence.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class secondOccurence {

	public static void main(String ARgs[])
	{
		int arr[] ={2,4,5,4,3,2,6,7,5,7};
		ArrayList<Integer> result = new ArrayList<Integer>();
//		Map<Integer,Integer> counterMap = new HashMap<>();
//		 for(int i=0;i<arr.length;i++)
//		 {
//	         if(counterMap.containsKey(arr[i])){
//	          counterMap.put(arr[i], counterMap.get(arr[i])+1 );
//	         }else{
//	          counterMap.put(arr[i], 1);
//	         }
//	    }
//		 
//		 for(int i=0;i<counterMap.size();i++)
//		 {
//			 if(counterMap.get(i).)
//			 //System.out.println(counterMap.get(i));
//		 }
		Arrays.sort(arr);

		for(int i = 1; i < arr.length; i++) {
		    if(arr[i] == arr[i - 1]) {
		      // result[result.length +1] =arr[i];
		        result.add(arr[i]);
		    }
		}
        System.out.println("Duplicates are: " );

		for(int i=0; i< result.size(); i++)
		{
			System.out.print(result.get(i).intValue() +" ");
		}

	}
	
}
