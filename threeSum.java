///////////////////////////////////////////////////////////////////////
// ThreeSum.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class threeSum {

	 static int find(int[] a)
	 {
		 int totalMatch = 0;
		 for(int i = 0; i< (a.length - 2); i++)
		 {
			 for(int j = i+1; j<(a.length-1); j++)
				{
				 for(int k = j+1; k<(a.length); k++)
				 {
				 if( ( a[i] + a[j] + a[k] ) == 0)
				    { 
				  System.out.println("Index"+(i+1) + "  Index" + (j+1) +" Index "+(k+1));
				  totalMatch = totalMatch +1;
				  }
				 }
				}
		 } return totalMatch;
	 }

	  void add(int[] a, int target)
	 {		 
		 int i = 0;
		 int len = 0;
		 while(a[i] != '\0')
		 {
			 len = len+ 1;
		 }
		 
		 a[len+1] = target;
	 }
	 
	  int partition(int A[], int si, int ei)
	 {
	     int x = A[ei];
	     int i = (si - 1);
	     int j;
	  
	     for (j = si; j <= ei - 1; j++)
	     {
	         if(A[j] <= x)
	         {
	             i++;
	             int temp;
	             temp = A[i];
	             A[i] = A[j];
	             A[j] = temp;
	         }
	     }
	     int temp1;
	     temp1 = A[i+1];
	     A[i+1] = A[ei];
	     A[ei] = temp1;
	     return (i + 1);
	 }
 void quickSort(int A[], int si, int ei)
{
    int pi = 0;    
    if(si < ei)
    {
        pi = partition(A, si, ei);
        quickSort(A, si, pi - 1);
        quickSort(A, pi + 1, ei);
    }
    

int len = 0;
int i = 0;

    while(A[i] != '\0')
	 {
		 i = i+1;
		 len = len+ 1;
	 }
	 
	 for ( i = 0; i<(len+1); i++)
	 {
		 System.out.println(A[i]);
	 }

    
    
    
    
}
	 
	public static void main(String args[])
	{ 
		int a[] = new int[10];
			a[0] = 2;
			a[1] = 7;
			a[2] = 4;
			a[3] = 15;
			a[4] = '\0';
			System.out.println("Following are the 3 combinations that produce a sum of 0");
			threeSum threesum = new threeSum();
			threesum.quickSort (a, 0, 3);
			
		
		int finalMatch = 0;
		finalMatch = find(a);
		
		}
	
	
}
