///////////////////////////////////////////////////////////////////////
// TwoSum.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.Scanner;

public class twoSum {

	 static int find(int[] a, int target)
	 {
		 int totalMatch = 0;
		 for(int i = 0; i< a.length - 1; i++)
		 {
			 for(int j = i+1; j<a.length; j++)
				{
				 if(a[i] + a[j] == target)
				 { 
				  System.out.println("Index"+(i+1) + "  Index" + (j+1));
				  totalMatch = totalMatch +1;
				}
				 }
		 } return totalMatch;
	 }

	 static void add(int[] a, int target)
	 {		 
		 int i = 0;
		 int len = 0;
		 while(a[i] != '\0')
		 {
			 i = i+1;
			 len = len+ 1;
		 }
		 
		 a[len+1] = target;
	 }
	 
	public static void main(String args[])
	{ 
		int a[] = new int[10];
			a[0] = 4;
			a[1] = 4;
			a[2] = 5;
			a[3] = 15;
			a[4] = '\0';
		int target = 9;
		System.out.println("Below are the indexes whose values ] produce a sum of 0");
		int finalMatch = 0;
		finalMatch = find(a,target);
		Scanner newTargetS = new Scanner (System.in);
		int newTarget = newTargetS.nextInt();
		add(a, newTarget);
		finalMatch = find(a,target);
		}
	
	
}
