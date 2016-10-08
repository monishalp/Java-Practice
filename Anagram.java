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

import java.util.Arrays;

public class Anagram {
	
	public static boolean checkAnagram(String a, String b)
	    {	
			String a1 = a.replace("\\S", "").toLowerCase();
			String b1 = b.replace("\\S", "").toLowerCase();
			if(a1.length()!= b1.length())
				return false;
			//a1.toLowerCase();
			//b1.toLowerCase();
			char[] aChar = a1.toLowerCase().toCharArray();
			char[] 	bChar = b1.toLowerCase().toCharArray();
			
			Arrays.sort(aChar);
			Arrays.sort(bChar);		
			 if(Arrays.equals(aChar, bChar))
			{
				return true;
			}
			
			else 
				return false;
	}
	
	public static void main(String Args[])
	{
		boolean check = true;
		
		check = checkAnagram("Mother In law", "Hitler woman");
		if(check == true)
			System.out.println("They are Anagrams");
		else if(check == false) 
			System.out.println("They aren't anagrams");
		
	}
}
