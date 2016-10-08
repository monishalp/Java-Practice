///////////////////////////////////////////////////////////////////////
// PrimeNumbers.java                                                //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class PrimeNumbers {
	
	public static void main(String Args[])
	{
	  int s1, s2, s3,start,end, flag = 0;
	    start = 2;
	    end=50;
	    for(int i = start; i <= end; i++)
	    {
	        for( int j = 2; j < i; j++)
	        {
	            if(i % j == 0)
	            {
	                flag = 0;
	                break;
	            }
	            else
	            {
	                flag = 1;
	            }
	        }
	        if(flag == 1)
	        {
	            System.out.print(i +" ");
	        }
	    }
	}

}
