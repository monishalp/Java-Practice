///////////////////////////////////////////////////////////////////////
// Reverse Polish.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;
import java.io.*;
import java.util.Stack;

public class Reverse_polish {
	 
	public static void main(String[] args) {
		String[] fun = new String[] { "6", "4", "-", "8", "+" };
		System.out.println(compute(fun));
	}
 
	public static int compute(String[] fun) {
		String operators = "+-*/";
		int result = 0;
 
		Stack<String> stack = new Stack<String>();
 
		for (String t : fun) 
		{
			if (!operators.contains(t)) 
			{ 
				stack.push(t);
		} 
			else {
				int x = Integer.valueOf(stack.pop());
				int y = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(x + y));
					break;
				case "-":
					stack.push(String.valueOf(x - y));
					break;
				case "*":
					stack.push(String.valueOf(x * y));
					break;
				case "/":
					stack.push(String.valueOf(x / y));
					break;
				}
			}
		}
 
		result = Integer.valueOf(stack.pop());
        return result;
	}
}