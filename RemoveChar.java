///////////////////////////////////////////////////////////////////////
// RemoveChar.java                                                   //
// version:  1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: java Practice                                        // 
// Author:        Monisha Lakshmipathi                               //
//                (315) 751-3191, mlakshmi@syr.edu                   //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class RemoveChar {

    public static void main (String[] args) {
    	String str= "welcome to chicago";
    	char ch = 'e';
    	String rem = removeFun(str,ch); // send the string and the char to be removed
    	System.out.println(str+" is the original string");
        System.out.println (rem+ " is the string after removal of "+ch);
    }

    public static String removeFun (String str, char charToBeRemoved) {
        if (str == null)
            return "";

        StringBuilder St = new StringBuilder ();

        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i); // check if the given character matches the char to be removed.
            if (ch == charToBeRemoved)
            { }         // if it matches, do not append it to the resultString
            else {St.append (ch);}   // else append
        }
        return St.toString ();
    }
}