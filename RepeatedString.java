///////////////////////////////////////////////////////////////////////
// Repeated String.java                                              //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.ArrayList;

public class RepeatedString {

	public static int CountRepeated(ArrayList<String> itemList, String str) {
	    int count = 0;
	    for (String i : itemList) {
	        if (i.equals(str)) {
	          count++;
	        }
	    }
	    return count;
	}
	
	
	public static void main(String args[])
	{
		ArrayList<String> listItems = new ArrayList<String>();
		listItems.add("latha");
		listItems.add("mona");
		listItems.add("latha");
		listItems.add("pathi");
		listItems.add("latha");
		String search = "latha";
		int count = 0;
		count = CountRepeated(listItems, search);
		System.out.println(count);

	}
}
