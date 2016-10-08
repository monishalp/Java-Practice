///////////////////////////////////////////////////////////////////////
// WordLadder.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class wordLadder {

	public static void main(String[] args) {
String start = "hit";
String end = "cog";
Set<String> Dict = new HashSet<String>();
Dict.add("hot");
Dict.add("dot");
Dict.add("dog");
Dict.add("lot");
Dict.add("log");
Dict.add(end);
int finalCount = comp("hit", "cog", Dict);
System.out.println( finalCount);
	}

 private static int comp(String start, String end, Set<String> dict)
{ 
	 Deque<String> checkQue = new ArrayDeque<String>() ;
	 Deque<Integer> countQue = new ArrayDeque<Integer>();
	 checkQue.add(start);
	 countQue.addLast(1);
	// while (!(checkQue.poll()==null))
	 while (!(checkQue.isEmpty()))
		 
	 {
		 String check = checkQue.poll();
		 int count = countQue.poll();
		 if(check.equals(end))
			 return count;
		 for(int j=0;j<check.length();j++)
		 {
			 for(char c='a'; c<'z' ; c++)
			 {
				 char[] checkChar = check.toCharArray();
				 checkChar[j] = c;
				 String checkStr = new String(checkChar);
				 if(dict.contains(checkStr))
				 {
					 checkQue.add(checkStr);
					 countQue.add(count+1);
					 dict.remove(checkStr);
					 
				 }
				 
			 }
		 }
	 }
	 
	return countQue.poll();
	
}
 }
