///////////////////////////////////////////////////////////////////////
// CharOccurence.java                                                //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class CharOccurence {

    public static void main (String[] args) {
    	String s= "welcome to chicago";
    	char ch = 'e'; 
    	int count = CountFunction(s,ch);
    	System.out.println(s+" is the original string");
        System.out.println (count+ " is count of "+ch + " in "+s);
    }

    public static int CountFunction (String str, char charToBeCounted) {
        if (str == null)
            return 0;
int countChar = 0;
        StringBuilder St = new StringBuilder ();

        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i);  // check if the char at (i) is equal to the char to be checked against.
            if (ch == charToBeCounted)
            {
            countChar++;	// increment the count if the values match
            }         
            else {}
        }
        return countChar;
    }
}