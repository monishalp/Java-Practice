///////////////////////////////////////////////////////////////////////
// Conversion_Collections.java                                       //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conversion_Collections {
	
	public static void main(String Args[])
	{
	String[] str = {"a", "q", "w", "e"};
	
	//////Arrays to ArrayList//////////////////////////
	
	ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(str));
	System.out.println("Items after conversting to ArrayList "); 
	for(String s: arrayList)
    {
		System.out.print(s+ " ");
	}
	
	/// HashMap to Array///////////////////////////
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	 hm.put(1,"a");
	 hm.put(2, "b");
	 hm.keySet().toArray(); 
	 hm.values().toArray();
	 System.out.println(" ");
	 System.out.println("Items after conversting to Array "); 
	 for(int i: hm.keySet())
	 System.out.print(hm.get(i));
	
	/////////  List to Set //////////////////////////////////
	List<String> list = new ArrayList<String>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");

    Set<String> set = new HashSet<String>(list);
	System.out.println(" ");
    System.out.println("Items after conversting to Set "); 
    for (String temp : set){
   	System.out.print(temp+ " ");
    }
    
	}

}
