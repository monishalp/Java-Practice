
///////////////////////////////////////////////////////////////////////
// RevStringItems.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;
import java.util.ArrayList;
public class RevStringItems
{
	
	public static ArrayList  RevString(String str,ArrayList reverse)
    {

        int index = str.indexOf(" ");
        reverse.add(str.substring(0, index)); // take the value of the string till a white space is encountered and append it to the reverse string
        str  = str.substring(index+1); 
        if(str.indexOf(" ")==-1)
        {
        	reverse.add(str.substring(0));
            return reverse;
        }
        return RevString(str,reverse); // keep recursively calling the function till we reach the end

    }
    public static void main(String args[])
    {
        String str = "Welcome to Chicago";
        ArrayList reverse = new ArrayList();
        
        
        
   reverse = RevString(str,reverse);
        StringBuilder RevString = new StringBuilder();
        for(int i = (reverse.size()-1); i>=0;i--)
        {
        	RevString.append(reverse.get(i)+" "); // keep calling the function and every result from the function is appended to the final reverse string
        }
        System.out.println(RevString);

    }
    
}