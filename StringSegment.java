///////////////////////////////////////////////////////////////////////
// StringSegment.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.HashSet;
import java.util.Set;

public class StringSegment {
	
	    public static boolean Segment(String s, Set<String> dict) {
	             return Partition(s, dict, 0);
	    }
	    
	    
	    
	    
	    public static boolean Partition(String s, Set<String> dict, int start){
	        if(start == s.length()) 
	            return true;
	 
	        for(String a: dict){
	            int len = a.length();
	            int end = start+len;
	               if(end > s.length()) 
	                continue;
	 
	            if(s.substring(start, start+len).equals(a))
	                if(Partition(s, dict, start+len))
	                    return true;
	        }
	 
	        return false;
	    }
public static void main(String Args[])
{
	String s = "monishalakshmipathi";
	Set<String> dict = new HashSet<String>();
	dict.add("monisha");
	dict.add("lakshmipathi");
	dict.add("blah");
	boolean b = Segment(s, dict);
	if (b == true)
	{
		System.out.println(" s can be segmented into a space-separated sequence of one or more dictionary words");
			}
	else 		System.out.println(" s can't be segmented into a space-separated sequence of one or more dictionary words");

	}
}
