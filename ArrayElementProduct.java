///////////////////////////////////////////////////////////////////////
// ArrayElementProduct.java                                          //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////

package PRAC;

public class ArrayElementProduct {

	public static void main(String Args[])
	{
		int a[] = {1,2,3,4};
		int b[] = new int[4];
		// to calculate the product of all the elements
		for(int i= 0; i<a.length-1; i++)
		{	
			int num =1;
			// First Calculate the product of all elements to the right of i
			for(int j = i+1; j<a.length; j++)
			{
				num = num *a[j];				
             }

			b[i] = num;
			//  Calculate the product of all elements to the left of i

			for(int j = 0; j<i; j++)
			{
				num = num *a[j];				
             }

			b[i] = num;

		}
		
		// print the new product array
		for(int j = 0; j<b.length - 1; j++)
		{
			System.out.println(b[j]);
         }
	}
	
}
