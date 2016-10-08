///////////////////////////////////////////////////////////////////////
// RemoveDuplicateChar.java                                          //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.ArrayList;
import java.io.*;
class RemoveDuplicateChar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String inputString = input.readLine();
        
        
        int len= inputString.length(); // find the length
        char ch;
        String str="";
         
 for(int i=0; i<len; i++)
      {
    ch = inputString.charAt(i);
      if(ch!=' ') 
          str = str + ch; 
    inputString = inputString.replace(ch,' '); //Replacing all occurrence of the current character with nothing
        }
 
       System.out.println("String after removing the duplicates is " + str);
    }
}