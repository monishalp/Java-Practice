///////////////////////////////////////////////////////////////////////
// RevString.java                                                    //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

class RevString{
    
	
	static String reverse(String s)
	{
		 int len = s.length();
		   String reverse = new String();
		      for ( int i = len - 1 ; i >= 0 ; i-- )
		         reverse = reverse + s.charAt(i);
		      return reverse;
	}
	
	public static void main(String args[])
	{
	    String Fin="";
String str1 = "welcome to chicago";
	     String str[] = "welcome to chicago".split(" ");
    
    
        for(int i = str.length-1; i>= 0 ;i--){
            Fin += str[i]+" ";
        }
        System.out.println(Fin);
        
        String rev = reverse(str1);
        System.out.println("The reverse is "+ rev);
        
    }
}