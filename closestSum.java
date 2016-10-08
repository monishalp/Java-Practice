///////////////////////////////////////////////////////////////////////
// ClosestSum.java                                                //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class closestSum {

	public static int threeSumClosest(int[] a, int target) {
	    int min = target;
		int result = 0;
	 
	 
		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			int k = a.length - 1;
			while (j < k) { 
				int sum = a[i] + a[j] + a[k];
				int diff = Math.abs(sum - target);
	 
				if(diff == 0) return sum;
	 
				if (diff < min) {
					min = diff;
					result = sum;
					System.out.println("The Closest Sum is: "+result);
					System.out.println("The Closest Sum generators are:"
							+ " ("+a[i]+"+"+a[j]+"+"+a[k]+")");

				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}

		return result;
	}
	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 2;
		a[1] = 7;
		a[2] = 4;
		a[3] = 15;
		a[4] = '\0';
		int k = 0;
		
		k = threeSumClosest(a, 10);
		
	}

}


