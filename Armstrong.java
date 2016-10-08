///////////////////////////////////////////////////////////////////////
// Anagram.java                                                      //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.Scanner;

public class Armstrong {
	public static void main(String Args[])
{
	int num;
	Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
	
	int count =0;
	int temp = num;
	int sum = 0;
	
	while(temp!=0)
	{
		count = count+1;
		temp = temp/10;
	}
	
	temp = num;
	for(int i =0; i<count; i++)
	{
		
		temp = temp%10;
		sum = (int) (sum+Math.pow(temp,3));
		temp = temp/10;
	}
	
	
	if(num  == sum)
		System.out.println(num+ " is an amrstrong number");
	else System.out.println(num+ " is not an armstrong number");
	}



}
