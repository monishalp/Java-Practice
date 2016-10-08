///////////////////////////////////////////////////////////////////////
// SearchRotatedArray.java                                          //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class searchRotatedArray {
	
	public static int searchRotated(int[] nums, int target) {
	    int left = 0;
	    int right= nums.length-1;
	 
	    while(left<=right){
	        int mid = left + (right-left)/2;
	        if(target==nums[mid])
	            return mid;
	 
	        if(nums[left]<=nums[mid]){
	            if(nums[left]<=target&& target<nums[mid]){
	                right=mid-1;
	            }else{
	                left=mid+1;
	            }
	        }else{
	            if(nums[mid]<target&& target<=nums[right]){
	                left=mid+1;
	            }else{
	                right=mid-1;
	            }
	        }    
	    }
	 
	    return -1;
	}
 public static void main (String Args[])
 {
	 int a[] = new int[10];
		a[0] = 5;
		a[1] = 6;
		a[2] = 7;
		a[3] = 1;
		a[4] = 2;
		a[5] = 3;
		a[6] = 4;
		
	int target = 6;
	int locFound; 
	locFound = searchRotated(a,target);
	if(locFound == -1)
		System.out.println("The target was not found");
	else
	System.out.println("The target was found at " +(locFound +1));
 }
}
